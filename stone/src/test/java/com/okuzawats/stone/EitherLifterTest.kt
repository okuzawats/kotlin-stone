package com.okuzawats.stone

import org.junit.Test

class EitherLifterTest {
  @Test
  fun testToEither_fromValueToRight() {
    val actual = 42.toEither<Throwable, Int>()

    assert(actual is Either.Right && actual.value == 42)
  }

  @Test
  fun testToEither_fromThrowableToLeft() {
    val actual = NotImplementedError().toEither<Throwable, Int>()

    assert(actual is Either.Left && actual.error is NotImplementedError)
  }
}
