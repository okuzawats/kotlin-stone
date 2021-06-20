package com.okuzawats.stone

import org.junit.Assert.*
import org.junit.Test

class OptionTest {
    @Test
    fun testOption() {
        Option.Some(value = 42)
        Option.None
    }
}