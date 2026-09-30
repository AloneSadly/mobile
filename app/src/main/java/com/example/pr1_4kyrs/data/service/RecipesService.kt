package com.example.pr1_4kyrs.data.service

import com.example.pr1_4kyrs.data.model.Recipes
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface RecipesService {

    @GET("recipes/{id}")
    suspend fun getRecipeById(@Path("id") id: Int): Recipes
    @PUT("recipes/{id}")
    suspend fun updateRecipe(@Path("id") id:Int, @Body recipes: Recipes): Recipes
}