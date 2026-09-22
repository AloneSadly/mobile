package com.example.pr1_4kyrs.ui.theme.objects

import com.example.pr1_4kyrs.ui.theme.`interface`.UserService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiService: UserService = retrofit.create(UserService::class.java)
}