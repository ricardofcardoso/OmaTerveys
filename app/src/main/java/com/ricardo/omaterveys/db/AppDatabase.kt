package com.ricardo.omaterveys.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ricardo.omaterveys.data.model.HealthEntry

@Database(entities = [HealthEntry::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun healthDao(): HealthDao
}
