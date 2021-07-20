package com.example.hilt.presentation

import com.example.hilt.data.MovieData
import com.example.hilt.presentation.base.BasePresenter
import com.example.hilt.presentation.base.BaseView

interface MoviesContractor {
    interface View : BaseView<Presenter> {
        fun onGetMoviesSuccess(movies: List<MovieData>)
        fun onGetMoviesFailure(errMessage: String)
    }

    interface Presenter : BasePresenter<View> {
        fun getMovies()
    }
}