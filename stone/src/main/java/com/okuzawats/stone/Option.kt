package com.okuzawats.stone

sealed class Option<T> {
    data class Some<T>(val value: T) : Option<T>()
    object None : Option<Nothing>()
}