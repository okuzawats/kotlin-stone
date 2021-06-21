package com.okuzawats.stone.option

/**
 * convert nullable value to Option
 *
 * @param T the type of value
 * @return Option of type [T]
 */
fun <T> T?.toOption(): Option<out T> =
  if (this != null) Option.Some<T>(value = this)
  else Option.None
