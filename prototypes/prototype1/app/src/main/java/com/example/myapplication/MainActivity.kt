package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
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
        val data = task[position]
        val inflter = LayoutInflater.from(this)
        val v = inflter.inflate(R.layout.update_task, null)

        var taskUp = v.findViewById<TextView>(R.id.editTask)
        taskUp.setText(data.task)

        val hourUp = v.findViewById<TextView>(R.id.edithour)

        val addDialog = AlertDialog.Builder(this)
        addDialog.setView(v)
        addDialog.setPositiveButton("OK"){
            dialog,_->
            data.task = taskUp.text.toString()
            data.hour = hourUp.text.toString().toInt()
            adapter.setItems(task)
            dialog.dismiss()
        }
        addDialog.setNegativeButton("Cancel"){
            dialog,_->
            dialog.dismiss()
            Toast.makeText(this, "Cancel", Toast.LENGTH_SHORT).show()
        }
        addDialog.create()
        addDialog.show()

    }
}



