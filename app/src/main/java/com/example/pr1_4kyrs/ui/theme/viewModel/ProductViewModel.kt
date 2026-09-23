package com.example.pr1_4kyrs.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1_4kyrs.ui.theme.data.Dimension
import com.example.pr1_4kyrs.ui.theme.data.Product
import com.example.pr1_4kyrs.ui.theme.objects.RetrofitClient
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel(){

    fun loadProduct(){
        val dimension = Dimension(350.00,350.00,95.00)
        val product = Product("Робот-пылесос CleanBot Max", 33600.00, dimensions = listOf(dimension), 4)

        viewModelScope.launch{
            val responce = RetrofitClient.apiProductService.createProduct(product)
            val resp = RetrofitClient.apiProductService.getProduct()

            if(responce.isSuccessful){
                Log.d("CreateProduct", "The product was successfully created!")
            }
            else{
                Log.d("CreateProduct", "It was not possible to create the product.")
            }

            for (product in resp.product){
                Log.d("", "-----------------------------------------")
                Log.d("ProductsResponce", "Title - ${product.title}")
                Log.d("ProductsResponce", "Dimensions - ${product.dimensions}")
                Log.d("ProductsResponce", "Weight - ${product.weight}")
                Log.d("ProductsResponce", "Price - ${product.price}")
            }
        }
    }
}