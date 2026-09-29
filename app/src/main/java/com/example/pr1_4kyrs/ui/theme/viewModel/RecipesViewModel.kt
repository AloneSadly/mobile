package com.example.pr1_4kyrs.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1_4kyrs.data.model.Recipes
import com.example.pr1_4kyrs.data.service.RetrofitClient
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class RecipesViewModel: ViewModel(){

    fun updateRecipes(id: Int, recipes: Recipes){
        viewModelScope.launch {
            try {
                val retrofit = RetrofitClient.apiRecipesService
                retrofit.updateRecipe(id, recipes)

            }catch (ex: Exception){
                Log.d("ERROR_updateRecipes","${ex.message}")
            }
        }

    }
}