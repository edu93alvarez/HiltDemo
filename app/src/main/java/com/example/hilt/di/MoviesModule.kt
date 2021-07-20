package com.example.hilt.di

import com.example.hilt.data.MoviesDataRepository
import com.example.hilt.data.NetworkApiInterface
import com.example.hilt.domain.MoviesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@InstallIn(ViewModelComponent::class)
@Module
internal object MoviesModule {

    @Provides
    @ViewModelScoped
    fun provideMoviesDataRepository(
        apiInterface: NetworkApiInterface
    ): MoviesRepository {
        return MoviesDataRepository(apiInterface)
    }
}