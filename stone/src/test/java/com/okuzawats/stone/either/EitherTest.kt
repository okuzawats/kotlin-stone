package com.okuzawats.stone

import com.okuzawats.stone.either.Either
import org.junit.Test

class EitherTest {
  @Test
  fun testRight_hasValue() {
    val target = Either.Right(value = 42)
    val expected = 42

    assert(target.value == expected)
  }

  @Test
  fun testLeft_hasThrowable() {
    val target = Either.Left(error = Throwable())

    assert(target.error is Throwable)
  }
}
