package com.okuzawats.stone

/**
 * convert value to Either.Right
 *
 * @param E the type of Either.Left error
 * @param T the type of Either.Right value
 * @return Either.Right with type of <E, T>, value is [this]
 */
fun <E : Throwable, T : Any> T.toEither(): Either<E, T> = Either.Right(value = this)

/**
 * convert throwable to Either.Left
 *
 * @param E the type of Either.Left error
 * @param T the type of Either.Right value
 * @return Either.Left with type of <E, T>, error is [this]
 */
fun <E : Throwable, T : Any> E.toEither(): Either<E, T> = Either.Left(error = this)
