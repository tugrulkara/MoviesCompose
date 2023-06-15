package com.tugrulkara.moviescompose.data.di

import com.tugrulkara.moviescompose.data.remote.MovieApi
import com.tugrulkara.moviescompose.data.repository.MovieRepositoryImpl
import com.tugrulkara.moviescompose.domain.repository.MovieRepository
import com.tugrulkara.moviescompose.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideMovieApi(): MovieApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieApi::class.java)
    }

    @Singleton
    @Provides
    fun provideMovieRepository(api: MovieApi) : MovieRepository{
        return MovieRepositoryImpl(api)
    }

}