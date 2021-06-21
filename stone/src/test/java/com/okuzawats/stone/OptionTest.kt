package com.okuzawats.stone

import org.junit.Test

class OptionTest {
  @Test
  fun testOption_hasValue() {
    val target = Option.Some(value = 42)
    val expected = 42

    assert(target.value == expected)
  }

  @Test
  fun testOption_isNone() {
    val target = Option.None

    assert(target is Option.None)
  }
}
