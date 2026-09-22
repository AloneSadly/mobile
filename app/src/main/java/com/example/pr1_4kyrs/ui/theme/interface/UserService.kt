package com.example.pr1_4kyrs.ui.theme.`interface`

import com.example.pr1_4kyrs.ui.theme.data.UsersResponce
import retrofit2.http.*

interface UserService {
    @GET("users")
    suspend fun getUser(): UsersResponce
}