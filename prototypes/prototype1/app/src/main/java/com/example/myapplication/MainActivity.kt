package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.list.layoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL, false)
        adapter = ListAdapter(task, {position -> del(position)}, {position -> update(position)})
        binding.list.adapter = adapter

        binding.add.setOnClickListener({ add() })
        task.add(Data(idCounter,"Shopping", 6))
        task.add(Data(idCounter,"Read", 2))
    }
    val task = ArrayList<Data>()
    var idCounter = 0
    fun add() {
        var taskValue = binding.task.text.toString()
        var hourValue = binding.hour.text.toString().toInt()
        task.add(Data(idCounter,taskValue, hourValue))
        adapter.setItems(task)
        idCounter++
    }
  fun del(position:Int){
      if (position < task.size) {
          task.removeAt(position)
          adapter.setItems(task)
      }
  }

    fun update(position: Int) {
        val inflter = LayoutInflater.from(this)
        val v = inflter.inflate(R.layout.update_task, null)
        val data = task[position]
        //data.task = newTask
        //data.hour = newHour
        adapter.setItems(task)
    }
}



