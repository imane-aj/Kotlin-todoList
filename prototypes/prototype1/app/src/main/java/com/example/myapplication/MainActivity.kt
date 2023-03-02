package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.add.setOnClickListener({ add() })

    }
    val task = ArrayList<Data>()
    fun add() {
        var taskValue = binding.task.text.toString()
        var hourValue = binding.hour.text.toString().toInt()
        task.add(Data(taskValue, hourValue, false))
        binding.list.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL, false)
        val adapter = ListAdapter(task)
        binding.list.adapter = adapter
    }

}