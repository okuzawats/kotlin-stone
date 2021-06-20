package com.okuzawats.stone

sealed class Either<E, T> {
  data class Left<E>(val error: E) : Either<E, Nothing>()
  data class Right<T>(val value: T) : Either<Nothing, T>()
}
