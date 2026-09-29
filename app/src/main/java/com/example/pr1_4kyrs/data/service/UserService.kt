package com.example.pr1_4kyrs.data.service

import com.example.pr1_4kyrs.data.model.UsersResponce
import retrofit2.http.*

interface UserService {
    @GET("users")
    suspend fun getUser(): UsersResponce
}