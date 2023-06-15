package com.tugrulkara.moviescompose.domain.model

import com.tugrulkara.moviescompose.data.remote.dto.Rating

data class MovieDetail(
    val Actors: String,
    val Country: String,
    val Genre: String,
    val Language: String,
    val Poster: String,
    val Production: String,
    val Released: String,
    val Title: String,
    val Type: String,
    val Year: String,
    val imdbRating: String
)
