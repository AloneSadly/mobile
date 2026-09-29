package com.example.pr1_4kyrs.data.service

import com.example.pr1_4kyrs.data.model.Recipes
import retrofit2.http.Body
import retrofit2.http.PUT
import retrofit2.http.Path

interface RecipesService {


    @PUT("recipes/{id}")
    suspend fun updateRecipe(@Path("id") id:Int, @Body recipes: Recipes): Recipes
}