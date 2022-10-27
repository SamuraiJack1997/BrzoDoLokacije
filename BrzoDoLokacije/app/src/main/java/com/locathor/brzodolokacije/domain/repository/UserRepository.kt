package com.locathor.brzodolokacije.domain.repository

import com.locathor.brzodolokacije.data.remote.dto.LoginResponse
import com.locathor.brzodolokacije.domain.model.User
import com.locathor.brzodolokacije.util.Resource
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun registerUser(
        username: String,
        email: String,
        name: String,
        surname: String,
        //profilePic: String,
        password: String
    ): Flow<Resource<User>>

    suspend fun loginUser(
        username: String,
        password: String
    ): Flow<Resource<LoginResponse>>
}
