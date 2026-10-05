package com.example.pr1_4kyrs.data.service

import com.example.pr1_4kyrs.data.model.Recipe
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface RecipesService {

    @GET("recipes/{id}")
    suspend fun getRecipeById(@Path("id") recipeId: Int): Recipe
    @PUT("recipes/{id}")
    suspend fun updateRecipe(@Path("id") id:Int, @Body recipes: Recipe): Recipe
}