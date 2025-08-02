package com.ricardo.omaterveys.ui.theme.screens

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ricardo.omaterveys.data.model.HealthEntry
import com.ricardo.omaterveys.viewmodel.HealthViewModel
import java.time.LocalDate
import kotlin.math.roundToInt

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun AddEntryScreen(
    viewModel: HealthViewModel = hiltViewModel(),
    onSave: () -> Unit
) {
    var mood by remember { mutableIntStateOf(3) }
    var sleep by remember { mutableFloatStateOf(7f) }
    var exercise by remember { mutableIntStateOf(30) }
    var notes by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(
        Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("Add Health Entry", style = MaterialTheme.typography.titleLarge)

        Text("Mood (1-5): $mood")
        Slider(
            value = mood.toFloat(),
            onValueChange = { mood = it.toInt() },
            valueRange = 1f..5f,
            steps = 3
        )

        Text("Sleep Hours: $sleep")
        Slider(
            value = sleep,
            onValueChange = { sleep = (it * 2).roundToInt() / 2f },
            valueRange = 0f..12f
        )

        Text("Exercise Minutes: $exercise")
        Slider(
            value = exercise.toFloat(),
            onValueChange = { exercise = it.toInt() },
            valueRange = 0f..120f,
            steps = 11
        )

        OutlinedTextField(
            value = notes,
            onValueChange = { notes = it },
            label = { Text("Notes") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(onClick = {
            val today = LocalDate.now().toString()
            viewModel.addEntry(
                HealthEntry(
                    date = today,
                    mood = mood,
                    sleepHours = sleep,
                    exerciseMinutes = exercise,
                    notes = notes
                )
            )
            onSave()
        }, modifier = Modifier.align(Alignment.End)) {
            Text("Save")
        }
    }
}
