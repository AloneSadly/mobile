package com.example.pr1_4kyrs.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1_4kyrs.ui.theme.objects.RetrofitClient
import kotlinx.coroutines.launch

class UsersViewModel : ViewModel(){
    fun loadUsers(){
        viewModelScope.launch{
            val responce = RetrofitClient.apiService.getUser()
            for (user in responce.users){
                Log.d("", "-------------------------")
                Log.d("UsersResponce", "Имя - ${user.firstName}, Фамилия - ${user.lastName}")
                Log.d("UsersResponce", "UserName - ${user.username}")
                Log.d("UsersResponce", "Role - ${user.role}")
            }
        }
    }
}