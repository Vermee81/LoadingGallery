package com.asahi.digital.lodinggallary.model

import com.squareup.moshi.Json

data class Movie(
    @field:Json(name = "id") val id: String,
    @field:Json(name = "name") val name: String,
    @field:Json(name = "director") val director: String,
    @field:Json(name = "rating") val rating: Int
)


