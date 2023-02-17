package com.example.tictactoy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ticTac(view: View) {
        val choice = view as Button
        var butnId = 0
        when(choice.id){
            R.id.bu1 -> butnId = 1
            R.id.bu2 -> butnId = 2
            R.id.bu3 -> butnId = 3
            R.id.bu4 -> butnId = 4
            R.id.bu5 -> butnId = 5
            R.id.bu6 -> butnId = 6
            R.id.bu7 -> butnId = 7
            R.id.bu8 -> butnId = 8
            R.id.bu9 -> butnId = 9
        }
        Log.d("butnId", butnId.toString())
        play(butnId, choice)
    }
    val player1 = mutableListOf<Int>()
    val player2 = mutableListOf<Int>()
    var activePlayer = 1
    fun play(butnId:Int, choice:Button){
        if(activePlayer == 1){
            choice.setText("X")
            choice.setBackgroundResource(R.color.teal_700)
            player1.add(butnId)
            activePlayer = 2
        }else{
            choice.setText("O")
            choice.setBackgroundResource(R.color.purple_700)
            player2.add(butnId)
            activePlayer = 1
        }
        choice.isEnabled = false
        winner()
    }

    fun winner(){
        var winner = -1
        if((player1.contains(1) && player1.contains(2) && player1.contains(3)) ||
            (player1.contains(4) && player1.contains(5) && player1.contains(6)) ||
            (player1.contains(7) && player1.contains(8) && player1.contains(9)) ||
            (player1.contains(1) && player1.contains(5) && player1.contains(9)) ||
            (player1.contains(1) && player1.contains(2) && player1.contains(3)) ||
            (player1.contains(3) && player1.contains(5) && player1.contains(7)) ||
            (player1.contains(1) && player1.contains(4) && player1.contains(7)) ||
            (player1.contains(2) && player1.contains(5) && player1.contains(8)) ||
            (player1.contains(3) && player1.contains(6) && player1.contains(9))){
                winner = 1

        }else if((player2.contains(1) && player2.contains(2) && player2.contains(3)) ||
            (player2.contains(4) && player2.contains(5) && player2.contains(6)) ||
            (player2.contains(7) && player2.contains(8) && player2.contains(9)) ||
            (player2.contains(1) && player2.contains(5) && player2.contains(9)) ||
            (player2.contains(1) && player2.contains(2) && player2.contains(3)) ||
            (player2.contains(3) && player2.contains(5) && player2.contains(7)) ||
            (player2.contains(1) && player2.contains(4) && player2.contains(7)) ||
            (player2.contains(2) && player2.contains(5) && player2.contains(8)) ||
            (player2.contains(3) && player2.contains(6) && player2.contains(9))){
            winner = 2
        }else{
            winner = 3
        }
        if(winner!=-1){
            if(winner == 1){
                Toast.makeText(this,"player 1 win the game", Toast.LENGTH_SHORT).show()
            }else if(winner == 2){
                Toast.makeText(this,"player 2 win the game", Toast.LENGTH_SHORT).show()
            }else if((player1.size>4 || player2.size>4) && winner == 3 ){
                Toast.makeText(this,"Loserss whooo!!", Toast.LENGTH_SHORT).show()
            }
        }
    }

}