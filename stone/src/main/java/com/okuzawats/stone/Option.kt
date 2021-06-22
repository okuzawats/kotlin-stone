package com.okuzawats.stone

/**
 * Has [Some] or [None].
 *
 * [Some] has a value lf [T].
 * [None] do not have any value.
 */
sealed class Option<out T : Any> {

  /**
   * A subclass of [Option] and has a value of [T].
   *
   * @param value [T]
   */
  data class Some<out T : Any>(val value: T) : Option<T>()

  /**
   * A subclass of [Option] and do not have any value.
   */
  object None : Option<Nothing>()
}
