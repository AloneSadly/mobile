package com.example.pr1_4kyrs.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1_4kyrs.data.model.Product
import com.example.pr1_4kyrs.data.service.RetrofitClient
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel(){

    fun createProduct(product: Product){
        viewModelScope.launch{
            try {
                val prod = RetrofitClient.apiProductService.createProduct(product)


                Log.d("-", "------------------------------")
                Log.d("ProductsResponce", "Title - ${prod.title}")
                Log.d("ProductsResponce", "Price - ${prod.price}")
                Log.d(
                    "ProductsResponce",
                    "Height - ${prod.dimensions.height}," +
                            "\nDepth - ${prod.dimensions.depth}," +
                            "\nWidth - ${prod.dimensions.width} "
                )
                Log.d("ProductsResponce", "Weight - ${prod.weight}")

            }catch (ex: Exception){
                Log.d("ERROR", "${ex.message}")
            }
        }
    }
    fun loadProduct (){
        viewModelScope.launch {
            try {
                val resp = RetrofitClient.apiProductService.getProduct()

                for (productss in resp.products) {

                        Log.d("-", "------------------------------")
                        Log.d("ProductsResponce", "Title - ${productss.title}")
                        Log.d(
                            "ProductsResponce",
                            "Height - ${productss.dimensions.height},\nDepth - ${productss.dimensions.depth},\nWidth - ${productss.dimensions.width} "
                        )
                        Log.d("ProductsResponce", "Weight - ${productss.weight}")
                        Log.d("ProductsResponce", "Price - ${productss.price}")
                    }

            }catch (ex: Exception){
                Log.d("ERROR___", "${ex.message}")
            }
        }
    }
}