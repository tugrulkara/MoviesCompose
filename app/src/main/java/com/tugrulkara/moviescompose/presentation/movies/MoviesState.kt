package com.tugrulkara.moviescompose.presentation.movies

import com.tugrulkara.moviescompose.domain.model.Movie

data class MoviesState(
    val isLoading: Boolean=false,
    val movieList: List<Movie> = emptyList(),
    val errorMessage:String="",
    val search:String="iron man"
)
