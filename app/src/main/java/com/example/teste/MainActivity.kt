package com.example.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }

        rollDice()
    }

    private fun rollDice() {
        val diceRoll = (1..6).random()

        val diceImage: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

        val txtRoll: TextView = findViewById(R.id.txtroll)
        val btnrolar: TextView = findViewById(R.id.btnrolar)
        val txtsorte: EditText = findViewById(R.id.txtsorte)

        txtRoll.text = diceRoll.toString()

        if(diceRoll == txtsorte.text.toString().toInt()){

            Toast.makeText(this, "parabens você ganhou :)", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(this, "que pena você perdeu :(", Toast.LENGTH_SHORT).show()
        }}}