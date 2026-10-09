package com.example.pr1_4kyrs.ui.theme.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr1_4kyrs.data.service.RetrofitClient
import kotlinx.coroutines.launch

class UsersViewModel : ViewModel(){
    fun loadUsers(){
        viewModelScope.launch{
            try {
                val responce = RetrofitClient.apiUserService.getUser()

                for (user in responce.users) {

                    Log.d("", "-------------------------")
                    Log.d("UsersResponce", "Имя - ${user.firstName}, Фамилия - ${user.lastName}")
                    Log.d("UsersResponce", "UserName - ${user.username}")
                    Log.d("UsersResponce", "Role - ${user.role}")
                }
            }catch (ex: Exception){
                Log.d("ERROR_loadUsers", "${ex.message}")
            }
        }
    }
    fun deleteUsers(userId: Int){
        viewModelScope.launch {
            try {
                val resp = RetrofitClient.apiUserService.deleteUser(userId)
                Log.d("UsersViewModel","isDeleted - ${resp.isDeleted}\ndeletedOn - ${resp.deletedOn}")


            }catch (ex: Exception){
                Log.d("ERROR_loadUsers", "${ex.message}")
            }
        }
    }
}