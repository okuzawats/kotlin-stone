package com.okuzawats.stone

import org.junit.Test

class EitherTest {
  @Test
  fun testEither() {
    Either.Left(error = Throwable())
    Either.Right(value = 42)
  }
}
