package com.asahi.digital.lodinggallary

import com.asahi.digital.lodinggallary.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieService {
    @GET("movies")
    fun listMovies(): Call<List<Movie>>
}