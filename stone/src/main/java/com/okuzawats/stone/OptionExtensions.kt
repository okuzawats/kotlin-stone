package com.okuzawats.stone

/**
 * return the value from Some if not None, else return default
 *
 * @return [T] the value from Some or default
 */
fun <T : Any> Option<T>.getOrElse(default: T): T = when (this) {
  is Option.Some -> this.value
  else -> default
}
