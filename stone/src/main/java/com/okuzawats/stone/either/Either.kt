package com.okuzawats.stone.either

/**
 * Has [Left] or [Right].
 *
 * [Left] has a [Throwable].
 * [Right] has a value of [T].
 */
sealed class Either<out E : Throwable, T> {

  /**
   * A subclass of [Either] and has an error.
   *
   * @param error Throwable
   */
  data class Left<out E : Throwable>(val error: E) : Either<E, Nothing>()

  /**
   * A subclass of [Either] and has a value of [T].
   *
   * @param value [T]
   */
  data class Right<T>(val value: T) : Either<Nothing, T>()
}
