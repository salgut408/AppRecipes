package com.example.android.myapplicationforrecipies.presentation.ui.recipe_list

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.myapplicationforrecipies.domain.model.Recipe
import com.example.android.myapplicationforrecipies.repository.RecipeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class RecipeListViewModel
@Inject constructor(
    private @Named("auth_token") val token: String,
    private val repository: RecipeRepository,
): ViewModel(){
// regular way
//    private val _recipes = MutableLiveData<List<Recipe>>()
//    val recipes: LiveData<List<Recipe>> get() = _recipes
    // compose way
 val recipes: MutableState<List<Recipe>> = mutableStateOf(listOf())




    init {
        viewModelScope.launch {
            val result = repository.search(
                token=token,
                page = 1,
                query="chiken"
            )
            recipes.value=result
        }
    }

}

















