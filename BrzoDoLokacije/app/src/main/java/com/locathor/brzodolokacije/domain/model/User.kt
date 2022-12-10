package com.locathor.brzodolokacije.domain.model

data class User(
    var id: Int,
    var username: String,
    var name: String,
    var surname: String,
    var email: String,
    var profilePicUrl: String
)