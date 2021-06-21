package com.okuzawats.stone

import org.junit.Test

class LifterTest {
  @Test
  fun testToOption_fromNonNull() {
    val int: Int? = 42
    val actual = int.toOption()

    assert(actual is Option.Some)
  }

  @Test
  fun testToOption_fromNullable() {
    val int: Int? = null
    val actual = int.toOption()

    assert(actual is Option.None)
  }
}