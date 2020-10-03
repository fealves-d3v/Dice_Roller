package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    lateinit var img_dice: ImageView
    lateinit var txv_dice: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img_dice = findViewById(R.id.dice_image)
        txv_dice = findViewById(R.id.txv_dice)
        val btn_roll: Button = findViewById(R.id.btn_roll)

        btn_roll.setOnClickListener {
            Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val txv_dice: TextView = findViewById(R.id.txv_dice)

        val randomInt = Random.nextInt(6) + 1
        txv_dice.text = randomInt.toString()

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        img_dice.setImageResource(drawableResource)
    }
}