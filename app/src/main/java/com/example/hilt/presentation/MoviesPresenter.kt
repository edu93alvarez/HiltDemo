package com.example.hilt.presentation

import com.example.hilt.di.ApiModule
import com.example.hilt.domain.MoviesRepository
import javax.inject.Inject

class MoviesPresenter @Inject constructor(private val movieRepository: MoviesRepository) :
    MoviesContractor.Presenter {

    override lateinit var view: MoviesContractor.View

    override fun getMovies() {
        movieRepository.getMovies(ApiModule.API_KEY_THE_MOVIE_DB)
    }


}