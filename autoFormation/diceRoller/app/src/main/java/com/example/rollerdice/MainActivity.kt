package com.example.rollerdice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toast(view: View) {
        rollDice()
    }

    private fun rollDice() {
        Toast.makeText(this,"Roller dice", Toast.LENGTH_SHORT).show()
        val dice = Dice(6)
        var diceRoller = dice.roll()
        val text = findViewById<TextView>(R.id.textView)
        text.setText(diceRoller.toString())

        val diceImg = Dice(6)
        val img = findViewById<ImageView>(R.id.imageView2)
        when (diceRoller) {
            1 -> img.setImageResource(R.drawable.dice_1)
            2 -> img.setImageResource(R.drawable.dice_2)
            3 -> img.setImageResource(R.drawable.dice_3)
            4 -> img.setImageResource(R.drawable.dice_4)
            5 -> img.setImageResource(R.drawable.dice_5)
            6 -> img.setImageResource(R.drawable.dice_6)
        }

    }

    class Dice(val numDice:Int){
        fun roll():Int{
            return (1 until numDice).random()
        }
    }
}