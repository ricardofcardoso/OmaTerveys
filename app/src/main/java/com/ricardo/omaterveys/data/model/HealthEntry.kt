package com.ricardo.omaterveys.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "health_entries")
data class HealthEntry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val date: String, // yyyy-MM-dd
    val mood: Int, // 1 to 5
    val sleepHours: Float,
    val exerciseMinutes: Int,
    val notes: String
)
