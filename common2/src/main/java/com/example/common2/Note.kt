package com.example.common2

import java.io.Serializable

data class Note(
    val title: String,
    val description: String? = null
) : Serializable