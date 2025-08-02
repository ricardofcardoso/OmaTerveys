package com.ricardo.omaterveys.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.ricardo.omaterveys.data.model.HealthEntry
import kotlinx.coroutines.flow.Flow

@Dao
interface HealthDao {
    @Query("SELECT * FROM health_entries ORDER BY date DESC")
    fun getAllEntries(): Flow<List<HealthEntry>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entry: HealthEntry)

    @Delete
    suspend fun delete(entry: HealthEntry)
}
