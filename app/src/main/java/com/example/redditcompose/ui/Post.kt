package com.example.redditcompose.ui

data class Post(
    val id: Int? = null,
    val imageRes: Int = 0,
    val imageContentDescription: String = "",
    val title: String = "",
    val preview: String = "",
    val username: String = "",
    val userAvatarImage: Int = 0,
    val userAvatarImageContentDescription: String = "",
)
