package com.example.myapplication

import android.support.v7.widget.RecyclerView
import android.util.Property
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Switch
import android.widget.TextView
import com.example.myapplication.databinding.ListRowBinding

class ListAdapter(val taskList: ArrayList<Data>, val onClickDel:(Int)->Unit, val onClickUpdate:(Int)->Unit):RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    private var listData = taskList
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val inflater = LayoutInflater.from(p0.context)
        val binding = ListRowBinding.inflate(inflater, p0, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data, position)
    }

    inner class ViewHolder(private val binding: ListRowBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Data, position: Int) {
            binding.taskView.text = item.task
            binding.hourView.text = item.hour.toString()
            binding.del.setOnClickListener { onClickDel(position) }
            binding.edit.setOnClickListener { onClickUpdate(position) }
        }
    }
    fun setItems(Items: ArrayList<Data>) {
        listData = Items
        notifyDataSetChanged()
    }
}