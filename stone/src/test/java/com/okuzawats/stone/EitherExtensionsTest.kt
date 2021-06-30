package com.okuzawats.stone

import org.junit.Test

class EitherExtensionsTest {
  @Test
  fun testGetOrElse_returnsDefaultValueIfNone() {
    val target = Either.Left(error = Throwable()).getOrElse(defaultValue = 42)
    val expected = 42

    assert(target == expected)
  }

  @Test
  fun testGetOrElse_returnsValueFromRightIfRight() {
    val target = Either.Right(value = 42).getOrElse(defaultValue = 0)
    val expected = 42

    assert(target == expected)
  }

  @Test
  fun testOrElse_returnsDefaultIfLeft() {
    val target = Either.Left(error = Throwable()).orElse(default = Either.Right(42))
    val expected = 42

    assert(target is Either.Right && target.value == expected)
  }

  @Test
  fun testOrElse_returnsRightIfRight() {
    val target = Either.Right(value = 42).orElse(default = Either.Right(0))
    val expected = 42

    assert(target is Either.Right && target.value == expected)
  }

  @Test
  fun testMap_returnsLeftIfLeft() {
    val target = Either.Left(error = Throwable()).map { it.toString() }

    assert(target is Either.Left)
  }

  @Test
  fun testMap_returnsTransformedRightIfRight() {
    val target = Either.Right(value = 42).map { it.toString() }
    val expected = 42.toString()

    assert(target is Either.Right && target.value == expected)
  }

  @Test
  fun testFlatMap_returnsLeftIfLeft() {
    val target = Either.Left(error = Throwable()).flatMap { Either.Right(value = it.toString()) }

    assert(target is Either.Left)
  }

  @Test
  fun testFlatMap_returnsTransformedRightIfRight() {
    val target = Either.Right(value = 42).flatMap { Either.Right(value = it.toString()) }
    val expected = 42.toString()

    assert(target is Either.Right && target.value == expected)
  }
}
