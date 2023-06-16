package com.tugrulkara.moviescompose.presentation.movies

sealed class MoviesEvent {

    data class Search(
        val searchString:String
    ): MoviesEvent()
}