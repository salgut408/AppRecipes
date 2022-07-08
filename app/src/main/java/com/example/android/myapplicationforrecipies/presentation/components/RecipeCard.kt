package com.example.android.myapplicationforrecipies.presentation.components

import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.android.myapplicationforrecipies.domain.model.Recipe

@Composable
fun RecipeCard(
    recipe: Recipe,
    onClick: ()-> Unit
){
    Card(
        shape = MaterialTheme.shapes.small
    ) {
        MaterialTheme.typography.body1
    }
}