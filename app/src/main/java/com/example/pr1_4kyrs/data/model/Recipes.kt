package com.example.pr1_4kyrs.data.model

data class Recipes(
    val name: String,
    val ingredients: List<String>,
    val cookTimeMinutes: Int,
    val difficulty: String
)
