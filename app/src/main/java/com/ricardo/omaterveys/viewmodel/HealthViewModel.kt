package com.ricardo.omaterveys.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ricardo.omaterveys.data.model.HealthEntry
import com.ricardo.omaterveys.db.HealthDao
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

@HiltViewModel
class HealthViewModel @Inject constructor(
    private val dao: HealthDao
) : ViewModel() {
    val entries: Flow<List<HealthEntry>> = dao.getAllEntries()

    fun addEntry(entry: HealthEntry) {
        viewModelScope.launch {
            dao.insert(entry)
        }
    }
}
