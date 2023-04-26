package com.example.todolisttutorial

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todolisttutorial.databinding.CartViewItemBinding

class TaskItemAdapter(
    private val taskItems: List<TaskItem>,
    mainActivity: MainActivity,
): RecyclerView.Adapter<TaskItemViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskItemViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CartViewItemBinding.inflate(from, parent, false)
        return TaskItemViewHolder(parent.context, binding)
    }

    override fun onBindViewHolder(holder: TaskItemViewHolder, position: Int) {
        holder.bindTaskItem(taskItems[position])
    }

    override fun getItemCount(): Int = taskItems.size
}