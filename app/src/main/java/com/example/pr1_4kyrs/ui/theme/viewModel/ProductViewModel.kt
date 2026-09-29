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
}