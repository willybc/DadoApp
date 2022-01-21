package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number(){
        val dado = Dado(6)
        val rollResult = dado.roll()

        assertTrue("El valor del lanzamiento no ha sido entre el 1 y el 6", rollResult in 1 .. 6 )
    }
}