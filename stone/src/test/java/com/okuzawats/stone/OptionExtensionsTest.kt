package com.okuzawats.stone

import org.junit.Test

class OptionExtensionsTest {
  @Test
  fun testGetOrElse_returnsValueFromSomeIfSome() {
    val target = Option.Some(value = 42).getOrElse(defaultValue = 0)
    val expected = 42

    assert(target == expected)
  }

  @Test
  fun testGetOrElse_returnsDefaultValueIfNone() {
    val target = Option.None.getOrElse(defaultValue = 42)
    val expected = 42

    assert(target == expected)
  }

  @Test
  fun testOrElse_returnsSomeIfSome() {
    val target = Option.Some(value = 42).orElse(default = Option.Some(0))
    val expected = 42

    assert(target is Option.Some && target.value == expected)
  }

  @Test
  fun testOrElse_returnsDefaultIfNone() {
    val target = Option.None.orElse(default = Option.Some(42))
    val expected = 42

    assert(target is Option.Some && target.value == expected)
  }

  @Test
  fun testMap_returnsTransformedSomeIfSome() {
    val target = Option.Some(value = 42).map { it.toString() }
    val expected = 42.toString()

    assert(target is Option.Some && target.value == expected)
  }

  @Test
  fun testMap_returnsNoneIfNone() {
    val target = Option.None.map { it.toString() }

    assert(target is Option.None)
  }

  @Test
  fun testFlatMap_returnsTransformedSomeIfSome() {
    val target = Option.Some(value = 42).flatMap { Option.Some(value = it.toString()) }
    val expected = 42.toString()

    assert(target is Option.Some && target.value == expected)
  }

  @Test
  fun testFlatMap_returnsNoneIfNone() {
    val target = Option.None.flatMap { Option.Some(value = it.toString()) }

    assert(target is Option.None)
  }

  @Test
  fun testFilter_returnsSomeIfPredicateIsTrue() {
    val target = Option.Some(value = 42).filter { it > 0 }
    val expected = 42

    assert(target is Option.Some && target.value == expected)
  }

  @Test
  fun testFilter_returnsNoneIfPredicateIsFalse() {
    val target = Option.Some(value = 42).filter { it < 0 }

    assert(target is Option.None)
  }

  @Test
  fun testFilter_returnsNoneIfNone() {
    val target = Option.None.filter { true }

    assert(target is Option.None)
  }
}
