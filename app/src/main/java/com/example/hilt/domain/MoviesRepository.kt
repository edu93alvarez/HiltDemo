package com.example.hilt.domain

import androidx.lifecycle.MutableLiveData
import com.example.hilt.data.MovieData

interface MoviesRepository {
    fun getMovies(apiKey: String): MutableLiveData<List<MovieData>?>
}