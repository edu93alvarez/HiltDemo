package com.example.hilt.data

import androidx.lifecycle.MutableLiveData
import com.example.hilt.di.ApiModule
import com.example.hilt.domain.MoviesRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MoviesDataRepository @Inject constructor(
    private val networkApiInterface: NetworkApiInterface
) : MoviesRepository {

    override fun getMovies(apiKey: String): MutableLiveData<List<MovieData>?> {
        val moviesLiveData = MutableLiveData<List<MovieData>?>()
        val call: Call<MoviesResponse> =
            networkApiInterface.getMovies(ApiModule.API_KEY_THE_MOVIE_DB, "1")
        call.enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(
                call: Call<MoviesResponse>,
                response: Response<MoviesResponse>) {
                if (response.isSuccessful) {
                    moviesLiveData.value = response.body()?.results
                }
            }

            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                moviesLiveData.value = null
            }
        })

        return moviesLiveData
    }

}