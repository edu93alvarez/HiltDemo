package com.example.hilt.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hilt.R
import com.example.hilt.data.MovieData

class MovieAdapter(
    private var mMovieList: List<MovieData>?
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val movieViewHolder: MovieViewHolder = holder as MovieViewHolder
        mMovieList?.get(position)
            ?.let { movie -> movieViewHolder.bind(movie) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(inflater.inflate(R.layout.item_movie, parent, false))
    }

    override fun getItemCount(): Int {
        return mMovieList?.size ?: 0
    }

    internal fun setMovies(movies: List<MovieData>?) {
        if (movies != null) {
            this.mMovieList = movies
            notifyDataSetChanged()
        }
    }
}