package com.example.todolisttutorial

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel: ViewModel() {
    var taskItems = MutableLiveData<MutableList<TaskItem>>()
    init {
        taskItems.value = mutableListOf()
    }
    fun addTaskItem(newTask:TaskItem){
        val list = taskItems.value
        list!!.add(newTask)
        taskItems.postValue(list)
    }
}