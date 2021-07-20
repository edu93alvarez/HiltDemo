package com.example.hilt.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkApiInterface {
    @GET("/3/movie/now_playing")
    fun getMovies(
        @Query("api_key") apiKey: String, @Query("page") page: String
    ): Call<MoviesResponse>
}