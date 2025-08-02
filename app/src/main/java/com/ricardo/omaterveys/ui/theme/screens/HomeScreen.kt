package com.ricardo.omaterveys.ui.theme.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ricardo.omaterveys.viewmodel.HealthViewModel

@Composable
fun HomeScreen(viewModel: HealthViewModel = hiltViewModel(), onAddEntry: () -> Unit) {
    val entries by viewModel.entries.collectAsState(initial = emptyList())

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = onAddEntry) {
                Icon(Icons.Default.Add, contentDescription = "Add Entry")
            }
        }
    ) { padding ->
        LazyColumn(contentPadding = padding) {
            items(entries) { entry ->
                Card(modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Date: ${entry.date}")
                        Text("Mood: ${entry.mood}/5")
                        Text("Sleep: ${entry.sleepHours}h, Exercise: ${entry.exerciseMinutes}min")
                        Text("Notes: ${entry.notes}")
                    }
                }
            }
        }
    }
}
