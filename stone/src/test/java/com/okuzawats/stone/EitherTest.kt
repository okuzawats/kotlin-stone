package com.okuzawats.stone

import org.junit.Test

class EitherTest {
  @Test
  fun testEither() {
    Either.Left(e = Throwable())
    Either.Right(value = 42)
  }
}
