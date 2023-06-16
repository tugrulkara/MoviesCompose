package com.tugrulkara.moviescompose.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tugrulkara.moviescompose.presentation.movie_detail.views.MovieDetailScreen
import com.tugrulkara.moviescompose.presentation.movies.views.MovieScreen
import com.tugrulkara.moviescompose.presentation.ui.theme.MoviesComposeTheme
import com.tugrulkara.moviescompose.util.Constants.IMDB_ID
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoviesComposeTheme {
                
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = MaterialTheme.colorScheme.background)
                ) {
                    val navController= rememberNavController()

                    NavHost(navController = navController, startDestination = Screen.MovieScreen.root ){
                        composable(Screen.MovieScreen.root){
                            MovieScreen(navController = navController)
                        }

                        composable(Screen.MovieDetailScreen.root+"/{${IMDB_ID}}"){
                            MovieDetailScreen()
                        }
                    }

                }

            }
        }
    }
}