package com.example.todolisttutorial

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import com.example.todolisttutorial.databinding.CartViewItemBinding

class TaskItemViewHolder(
    private val context: Context,
    private val binding: CartViewItemBinding,
): RecyclerView.ViewHolder(binding.root)
{

    fun bindTaskItem(taskItem: TaskItem)
    {
        binding.task.text = taskItem.name
        binding.desc.text = taskItem.desc
    }
}