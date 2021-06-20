package com.okuzawats.stone

sealed class Either<out E : Throwable, T> {
  data class Left<out E : Throwable>(val error: E) : Either<E, Nothing>()
  data class Right<T>(val value: T) : Either<Nothing, T>()
}
