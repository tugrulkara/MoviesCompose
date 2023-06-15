package com.tugrulkara.moviescompose.data.repository

import com.tugrulkara.moviescompose.data.remote.MovieApi
import com.tugrulkara.moviescompose.data.remote.dto.MovieDetailDto
import com.tugrulkara.moviescompose.data.remote.dto.MoviesDto
import com.tugrulkara.moviescompose.domain.repository.MovieRepository
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val api:MovieApi): MovieRepository {
    override suspend fun getMovies(search: String): MoviesDto {
        return api.getMovies(search = search)
    }

    override suspend fun getMovieDetail(imdbId: String): MovieDetailDto {
        return api.getMovieDetail(imdbId = imdbId)
    }
}