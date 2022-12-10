package com.locathor.brzodolokacije.presentation.user_profile

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.locathor.brzodolokacije.domain.model.Post
import com.locathor.brzodolokacije.domain.repository.UserRepository
import com.locathor.brzodolokacije.presentation.home.HomeState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserProfileViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val repository: UserRepository
): ViewModel(){
    var state by mutableStateOf(HomeState())

    init {
        getUser(savedStateHandle.get<Int>(key="id")!!);
    }

    private fun getUser(id: Int){
        viewModelScope.launch {
            repository.getUser(id)
//            state=state.copy(
//                posts=List(5){
//                    Post(
//                        ownerUsername = "Pera Peric",
//                        mediaUris = emptyList(),
//                        desc = "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout." +
//                                " The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters," +
//                                " as opposed to using 'Content here, content here', making it look like readable English.",
//                        likeCount=10,
//                        commentCount = 5,
//                        title="Paris Travel experience",
//                        createdAt = "",
//                        longitude = 0.0,
//                        latitude = 0.0
//                    )
//                }
//            )
        }
    }
}