package com.example.pr1_4kyrs.data.service

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.InetSocketAddress
import java.net.Proxy

object RetrofitClient {
    val proxy = Proxy(Proxy.Type.HTTP, InetSocketAddress("10.207.106.59", 3128))
    val logging = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    val okHttpClient = OkHttpClient.Builder()
        .proxy(proxy)
        .addInterceptor(logging)
        .build()
    val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val apiUserService: UserService = retrofit.create(UserService::class.java)
    val apiProductService: ProductService = retrofit.create(ProductService::class.java)
    val apiRecipesService: RecipesService = retrofit.create(RecipesService::class.java)
}