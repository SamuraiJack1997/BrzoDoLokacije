package com.locathor.brzodolokacije.data.mappers

import com.locathor.brzodolokacije.data.local.post.PostEntity
import com.locathor.brzodolokacije.data.remote.dto.PostDto
import com.locathor.brzodolokacije.domain.model.Post

fun PostEntity.toPost(): Post {
    return Post(
        title = title,
        desc = desc,
        latitude = latitude,
        longitude = longitude,
        createdAt = createdAt
    )
}

fun PostDto.toPostEntity(): PostEntity {
    return PostEntity(
        postId = postId,
        userId = userId,
        title = title ?: "",
        desc = desc ?: "",
        latitude = latitude ?: 0.0,
        longitude = longitude ?: 0.0,
        createdAt = createdAt ?: "",
        owner = owner ?: ""
    )
}

