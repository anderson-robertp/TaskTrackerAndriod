package com.example.tasktracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.tasktracker.viewmodel.TaskViewModel
import com.example.tasktracker.ui.screens.TaskListScreen
import com.example.tasktracker.ui.theme.TaskTrackerTheme

class MainActivity : ComponentActivity() {

    private val viewModel: TaskViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskTrackerTheme {
                TaskListScreen(viewModel)
            }
        }
    }
}
