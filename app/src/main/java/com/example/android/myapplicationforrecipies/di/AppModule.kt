package com.example.android.myapplicationforrecipies.di

import android.content.Context
import com.example.android.myapplicationforrecipies.presentation.BaseApplication
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
@Module
@InstallIn(SingletonComponent::class)

object AppModule {
    @Singleton
    @Provides
    fun provideApplication(@ApplicationContext app: Context): BaseApplication {
        return app as BaseApplication
    }


    @Singleton
    @Provides
    fun provideRandomString(): String{
        return "RANDOM STRING!!!!"
    }
}