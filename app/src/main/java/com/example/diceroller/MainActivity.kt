package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        // 1ro Dado
        val dado = Dado(6)
        val dadoRoll = dado.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when( dadoRoll ){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

        //Update the content description
        diceImage.contentDescription = dadoRoll.toString()

        /*2do Dado
        val dado2 = Dado(6)
        val resultadoDato2 = dado2.roll()
        val resultTextView2: TextView = findViewById(R.id.textView2)
        resultTextView2.text = resultadoDato2.toString()
        */
    }
}

class Dado(private val numLados: Int) {

    fun roll(): Int {
        return (1..numLados).random()
    }
}