package com.okuzawats.stone

/**
 * return the value from Some if not None, else return default
 *
 * @return [T] the value from Some or default
 */
fun <T : Any> Option<T>.getOrElse(default: T): T = when (this) {
  is Option.Some -> this.value
  is Option.None -> default
}

/**
 * transform Option<T> to Option<S>
 *
 * if it is Some, return Some<S>.
 * if it is None, return None
 * @param transform transformer from [T] to [S]
 * @return Option<S>. if it is None, return None
 */
fun <T : Any, S : Any> Option<T>.map(transform: (T) -> S): Option<S> = when (this) {
  is Option.Some -> Option.Some(value = transform(this.value))
  is Option.None -> Option.None
}
