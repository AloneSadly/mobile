package com.example.pr1_4kyrs.data.service


import com.example.pr1_4kyrs.data.model.Product
import com.example.pr1_4kyrs.data.model.ProductsResponce
import retrofit2.Response
import retrofit2.http.*

interface ProductService {


    @GET("products")
    suspend fun getProduct(): ProductsResponce

    @POST("products/add")
    suspend fun createProduct(@Body product: Product): Product
}