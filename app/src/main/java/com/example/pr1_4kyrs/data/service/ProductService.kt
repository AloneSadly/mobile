package com.example.pr1_4kyrs.data.service


import com.example.pr1_4kyrs.data.model.Product
import retrofit2.http.*

interface ProductService {

    @POST("products/add")
    suspend fun createProduct(@Body product: Product): Product
}