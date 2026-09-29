package com.example.pr1_4kyrs.data.service

import com.example.pr1_4kyrs.data.model.Recipes
import retrofit2.http.PUT

interface RecipesService {



    suspend fun updateRecipe(id:Int): Recipes
}