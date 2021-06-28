package com.okuzawats.stone

/**
 * return the value from Either if Left, else return [defaultValue]
 *
 * @return [T] the value from Left or [defaultValue]
 */
fun <E : Throwable, T : Any> Either<E, T>.getOrElse(defaultValue: T): T =
  when (this) {
    is Either.Left -> defaultValue
    is Either.Right -> value
  }

/**
 * return Left if it is Left, else return [default]
 *
 * @return Either<E, T> return Left if it is Left, or return [default]
 */
fun <E : Throwable, T : Any> Either<E, T>.orElse(default: Either<E, T>): Either<E, T> =
  when (this) {
    is Either.Left -> default
    is Either.Right -> this
  }

/**
 * transform Either<E, T> to Either<E, S>
 *
 * if it is Left, return Left<E>.
 * if it is Right, return Right<S>.
 * @param transform transformer from [T] to [S]
 * @return Either<E, S>. return Right<S> if it is Right, else Left<E>
 */
fun <E : Throwable, T : Any, S : Any> Either<E, T>.map(transform: (T) -> S): Either<E, S> =
  when (this) {
    is Either.Left -> Either.Left(error = error)
    is Either.Right -> Either.Right(value = transform(value))
  }

/**
 * transform Either<E, T> to Either<E, S>
 *
 * if it is Left, return Left<E>.
 * if it is Right, return Right<S>.
 * @param transform transformer from [T] to Either<E, S>
 * @return Either<E, S>. return Right<S> if it is Right, else Left<E>
 */
fun <E : Throwable, T : Any, S : Any> Either<E, T>.flatMap(transform: (T) -> Either<E, S>): Either<E, S> =
  when (this) {
    is Either.Left -> Either.Left(error = error)
    is Either.Right -> transform(value)
  }
