package com.okuzawats.stone

/**
 * return the value from Some if not None, else return default
 *
 * @return [T] the value from Some or default
 */
fun <T : Any> Option<T>.getOrElse(default: T): T = when (this) {
  is Option.Some -> value
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
  is Option.Some -> Option.Some(value = transform(value))
  is Option.None -> Option.None
}

/**
 * transform Option<T> to Option<S>
 *
 * if it is Some, return Some<S>.
 * if it is None, return None
 * @param transform transformer from [T] to Option[S]
 * @return Option<S>. if it is None, return None
 */
fun <T : Any, S : Any> Option<T>.flatMap(transform: (T) -> Option<S>): Option<S> = when (this) {
  is Option.Some -> transform(value)
  is Option.None -> Option.None
}

/**
 * return Some<T> if it is Some and predicate is true, else None
 *
 * if it is Some and predicate is true, return Some<S>.
 * else, return None
 * @param predicate predicate applied to [T]
 * @return Option<T> filtered by the [predicate]
 */
fun <T : Any> Option<T>.filter(predicate: (T) -> Boolean): Option<T> = when (this) {
  is Option.Some -> if (predicate(value)) {
    Option.Some(value = value)
  } else {
    Option.None
  }
  is Option.None -> Option.None
}