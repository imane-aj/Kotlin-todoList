package com.example.pourboire

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.LogPrinter
import android.view.View
import com.example.pourboire.databinding.ActivityMainBinding
import java.text.NumberFormat
import kotlin.jvm.internal.Intrinsics.Kotlin

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calc.setOnClickListener{ calculate() }
    }

    fun calculate() {
        val costOfS = binding.cost.text.toString()
        val cost = costOfS.toDouble()
        val tipOptions = binding.tipOptions.checkedRadioButtonId
        val choice = when(tipOptions){
            R.id.amazin -> 0.20
            R.id.good -> 0.18
            else -> 0.15
        }
        var tip = choice * cost
        Log.d("dd", tip.toString())
        val rounded = binding.switch2.isChecked
        if(rounded){
            tip = kotlin.math.ceil(tip)
            Log.d("round", tip.toString())
        }
        val formattedTip = NumberFormat.getCurrencyInstance().format(tip)
        Log.d("formattedTip",formattedTip.toString())

        binding.tipAmount.text = getString(R.string.tip_amount, formattedTip)
    }

}