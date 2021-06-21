package com.okuzawats.stone.option

/**
 * Has [Some] or [None].
 *
 * [Some] has a value lf [T].
 * [None] do not have any value.
 */
sealed class Option<T> {

  /**
   * A subclass of [Option] and has a value of [T].
   *
   * @param value [T]
   */
  data class Some<T>(val value: T) : Option<T>()

  /**
   * A subclass of [Option] and do not have any value.
   */
  object None : Option<Nothing>()
}
