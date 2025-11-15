package com.example.tasktracker.data.model

data class Task(
    val id: Int,
    var title: String,
    var isCompleted: Boolean = false
)
