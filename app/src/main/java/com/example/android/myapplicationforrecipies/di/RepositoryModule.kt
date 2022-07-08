package com.example.android.myapplicationforrecipies.di

import com.example.android.myapplicationforrecipies.network.RecipeService
import com.example.android.myapplicationforrecipies.network.model.RecipeDtoMapper
import com.example.android.myapplicationforrecipies.repository.RecipeRepository
import com.example.android.myapplicationforrecipies.repository.RecipeRepository_Impl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule{
    @Singleton
    @Provides
    fun provideRecipeRepository(recipeService: RecipeService, recipeDtoMapper: RecipeDtoMapper): RecipeRepository{
        return RecipeRepository_Impl(recipeService, recipeDtoMapper)
    }

}

















