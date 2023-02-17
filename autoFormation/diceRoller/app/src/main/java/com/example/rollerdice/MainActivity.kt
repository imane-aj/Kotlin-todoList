package com.example.rollerdice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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
        val dice = Dice(100)
        var diceRoller = dice.roll()
        val text = findViewById<TextView>(R.id.textView)
        text.setText(diceRoller.toString())
    }

    class Dice(val numDice:Int){
        fun roll():Int{
            return (1 until numDice).random()
        }
    }
}