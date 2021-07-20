package com.example.hilt.viewmodel

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.hilt.data.MovieData
import com.example.hilt.di.ApiModule
import com.example.hilt.domain.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MoviesViewModel @Inject constructor(
    private val moviesRepository: MoviesRepository,
    private val savedStateHandle: SavedStateHandle
) : ViewModel(), LifecycleObserver {

    private val moviesLiveData: MutableLiveData<List<MovieData>?> = moviesRepository.getMovies(
        ApiModule.API_KEY_THE_MOVIE_DB
    )

    fun getMovies() : MutableLiveData<List<MovieData>?> {
        return moviesLiveData
    }

}