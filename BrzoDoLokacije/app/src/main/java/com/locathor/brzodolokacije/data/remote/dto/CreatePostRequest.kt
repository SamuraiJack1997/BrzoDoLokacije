package com.locathor.brzodolokacije.data.remote.dto

data class CreatePostRequest(
     var title: String,
     var description: String,
     var latitude: Double,
     var longitude: Double,
     var createdDate: String,
     //val image: String,
     val ownerUsername: String
)
