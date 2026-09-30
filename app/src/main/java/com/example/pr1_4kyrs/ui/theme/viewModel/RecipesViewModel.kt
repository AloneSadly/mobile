package com.example.pr1_4kyrs.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1_4kyrs.data.model.Recipes
import com.example.pr1_4kyrs.data.service.RetrofitClient
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import kotlin.collections.listOf

class RecipesViewModel: ViewModel(){

    fun updateRecipes(id: Int){
        viewModelScope.launch {
            try {
                val recipe = RetrofitClient.apiRecipesService.getRecipeById(id)

                Log.d("RecipesViewModel", "recipe: \nname - ${recipe.name}\ningredients - ${recipe.ingredients}\ncookTimeMinutes - ${recipe.cookTimeMinutes}\ndifficulty - ${recipe.difficulty}")

                val newRecipes = recipe.copy(
                    "Куриное филе в сливочно-чесночном соусе",
                    listOf(
                        "Куриное филе",
                        "сливки", "чеснок",
                        "сливочное масло",
                        "растительное масло",
                        "твердый сыр", "соль",
                        "черный перец",
                        "итальянские травы"
                    ),
                    25,
                    "Легко"
                )
                val retrofit = RetrofitClient.apiRecipesService.updateRecipe(id, newRecipes)
                Log.d("RecipesViewModel", "recipe: \nname - ${retrofit.name}\ningredients - ${retrofit.ingredients}\ncookTimeMinutes - ${retrofit.cookTimeMinutes}\ndifficulty - ${retrofit.difficulty}")

            }catch (ex: Exception){
                Log.d("ERROR_updateRecipes","${ex.message}")
            }
        }

    }
}