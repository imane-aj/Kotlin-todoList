package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import com.example.myapplication.databinding.ListRowBinding

class ListAdapter(val taskList: ArrayList<Data>):RecyclerView.Adapter<ListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val inflater = LayoutInflater.from(p0.context)
        val binding = ListRowBinding.inflate(inflater, p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return taskList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = taskList[position]
        holder.bind(data)
    }

    class ViewHolder(private val binding: ListRowBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Data) {
            binding.taskView.text = item.task
            binding.hourView.text = item.hour.toString()
            binding.status.isChecked = item.status
        }
    }

}