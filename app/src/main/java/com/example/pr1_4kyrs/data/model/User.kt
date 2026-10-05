package com.example.pr1_4kyrs.data.model

data class User(
    val id: Int? = null,
    val firstName: String,
    val lastName: String,
    val username: String,
    val role: String,
    val isDeleted: Boolean = false,
    val deletedOn: String? = null
)
