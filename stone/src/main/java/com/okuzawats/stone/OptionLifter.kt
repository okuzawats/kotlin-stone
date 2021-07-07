package com.okuzawats.stone

/**
 * convert nullable value to Option
 *
 * @param T the type of value
 * @return Option of type [T]
 */
fun <T : Any> T?.toOption(): Option<T> =
  if (this != null) Option.Some(value = this)
  else Option.None
