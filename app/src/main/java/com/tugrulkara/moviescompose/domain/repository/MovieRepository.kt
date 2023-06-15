package com.tugrulkara.moviescompose.domain.repository

import com.tugrulkara.moviescompose.data.remote.dto.MovieDetailDto
import com.tugrulkara.moviescompose.data.remote.dto.MoviesDto

interface MovieRepository {

    suspend fun getMovies(search:String): MoviesDto
    suspend fun getMovieDetail(imdbId:String):MovieDetailDto
}