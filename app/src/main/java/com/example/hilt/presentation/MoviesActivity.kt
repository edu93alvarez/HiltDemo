package com.example.hilt.presentation

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hilt.R
import com.example.hilt.viewmodel.MoviesViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_movies.*

@AndroidEntryPoint
class MoviesActivity : AppCompatActivity() {

    private val moviesViewModel: MoviesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)
        moviesViewModel.getMovies().observe(this, Observer {
            rvMovies.layoutManager = LinearLayoutManager(this)
            val moviesAdapter = MovieAdapter(mMovieList = it)
            rvMovies.adapter = moviesAdapter
            moviesAdapter.setMovies(it)
        })
    }

}