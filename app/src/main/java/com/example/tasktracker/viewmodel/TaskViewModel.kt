package com.example.tasktracker.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.tasktracker.data.model.Task

class TaskViewModel : ViewModel() {

    private var nextId = 1
    var tasks = mutableStateListOf<Task>()
        private set

    fun addTask(title: String) {
        tasks.add(Task(nextId++, title))
    }

    fun toggleTaskComplete(id: Int) {
        val task = tasks.find { it.id == id }
        task?.isCompleted = !(task.isCompleted)
    }

    fun updateTask(id: Int, newTitle: String) {
        val task = tasks.find { it.id == id }
        if (task != null) {
            task.title = newTitle
        }
    }

    fun deleteTask(id: Int) {
        tasks.removeAll { it.id == id }
    }
}
