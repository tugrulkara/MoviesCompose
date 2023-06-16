package com.tugrulkara.moviescompose.presentation.movie_detail

import com.tugrulkara.moviescompose.domain.model.MovieDetail

data class MovieDetailState(
    val isLoading:Boolean=false,
    val movieDetail:MovieDetail?=null,
    val errorMessage:String=""
)
