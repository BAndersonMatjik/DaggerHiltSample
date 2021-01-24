package com.bmajik.daggerhiltsample.di

import com.bmajik.daggerhiltsample.data.IMainRepo
import com.bmajik.daggerhiltsample.data.MainRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun providesString(): IMainRepo = MainRepo()
}