package com.example.hilt.data

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    @SerializedName("results")
    var results: List<MovieData>? = null
)