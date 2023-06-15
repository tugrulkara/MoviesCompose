package com.tugrulkara.moviescompose.data.remote

import com.tugrulkara.moviescompose.data.remote.dto.MovieDetailDto
import com.tugrulkara.moviescompose.data.remote.dto.MoviesDto
import com.tugrulkara.moviescompose.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    //https://www.omdbapi.com/?apikey=4a58fab2&s=batman
    //https://www.omdbapi.com/?apikey=4a58fab2&i=tt0372784

    @GET(".")
    suspend fun getMovies(
        @Query("s") search: String,
        @Query("apikey") apiKey: String = API_KEY
    ):MoviesDto

    @GET("")
    suspend fun getMovieDetail(
        @Query("i") imdbId: String,
        @Query("apikey") apiKey: String = API_KEY
    ):MovieDetailDto
}