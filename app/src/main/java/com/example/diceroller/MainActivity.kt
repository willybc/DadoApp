package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDado() }


    }
    /**
     * Roll the dice and update the screen with the result.
     */

    private fun rollDado() {
        // Create new Dice object with 6 sides and roll it
        val dado = Dado(6)
        val dadoRoll = dado.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = dadoRoll.toString()

        //2Do Dado
        val dado2 = Dado(6)
        val resultadoDato2 = dado2.roll()
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = resultadoDato2.toString()
    }
}

class Dado(private val numLados: Int) {

    fun roll(): Int {
        return (1..numLados).random()
    }
}