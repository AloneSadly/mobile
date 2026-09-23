package com.example.pr1_4kyrs.ui.theme.`interface`


import com.example.pr1_4kyrs.ui.theme.data.Product
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ProductService {

    @POST("products")
        suspend fun createProduct(@Body product: Product): Response<Product>
}