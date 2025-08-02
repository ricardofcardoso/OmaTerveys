package com.ricardo.omaterveys.di

import android.content.Context
import androidx.room.Room
import com.ricardo.omaterveys.db.AppDatabase
import com.ricardo.omaterveys.db.HealthDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context): AppDatabase =
        Room.databaseBuilder(appContext, AppDatabase::class.java, "oma_terveys_db").build()

    @Provides
    @Singleton
    fun provideHealthDao(db: AppDatabase): HealthDao = db.healthDao()
}
