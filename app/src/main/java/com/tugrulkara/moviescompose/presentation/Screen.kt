package com.tugrulkara.moviescompose.presentation

sealed class Screen(val root:String) {

    object MovieScreen : Screen("movie_screen")
    object MovieDetailScreen : Screen("movie_detail_screen")
}