package com.example.pr1_4kyrs.ui.theme.`interface`


import com.example.pr1_4kyrs.ui.theme.data.Product
import com.example.pr1_4kyrs.ui.theme.data.ProductsResponce
import retrofit2.Response
import retrofit2.http.*

interface ProductService {


    @GET("products")
    suspend fun getProduct(): ProductsResponce

    @POST("products")
        suspend fun createProduct(@Body product: Product): Response<Product>
}