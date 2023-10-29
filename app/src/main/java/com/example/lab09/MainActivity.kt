package com.example.lab09

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab09.viewmodels.CounterViewModel
import com.example.lab09.views.Counter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val vista: CounterViewModel by viewModels()
        setContent {
            Counter(viewModel = vista)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val testViewModel = CounterViewModel()
    Counter(viewModel = testViewModel)
}