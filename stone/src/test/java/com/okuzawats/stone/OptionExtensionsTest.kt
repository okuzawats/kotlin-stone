package com.okuzawats.stone

import org.junit.Test

class OptionExtensionsTest {
  @Test
  fun testOrElse_returnsValueFromSomeIfNotNone() {
    val target = Option.Some(value = 42)
    val expected = 42

    assert(target.getOrElse(default = 0) == expected)
  }

  @Test
  fun testOrElse_returnsDefaultValueIfNone() {
    val target = Option.None
    val expected = 42

    assert(target.getOrElse(default = 42) == expected)
  }
}