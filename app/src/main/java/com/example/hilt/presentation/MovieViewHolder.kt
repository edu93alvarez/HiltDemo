package com.example.hilt.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.hilt.data.MovieData
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.item_movie.*


class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), LayoutContainer {

    fun bind(itemMovie: MovieData) {
        tvTitle.text = itemMovie.title ?: ""
        tvRate.text = itemMovie.popularity
        tvRelease.text = itemMovie.release_date
        /*
        Glide.with(itemView.context)
            .load(PDNetworkConstants.BASE_POSTER_URL + itemMovie.posterImagePath)
            .apply(RequestOptions().centerInside()).into(ivPoster)

         */

    }

    override val containerView: View?
        get() = itemView
}