package com.tugrulkara.moviescompose.presentation.movie_detail.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.tugrulkara.moviescompose.presentation.movie_detail.MovieDetailViewModel

@Composable
fun MovieDetailScreen(
    viewModel: MovieDetailViewModel= hiltViewModel()) {

    val state=viewModel.state.value

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black),
        contentAlignment = Alignment.Center ){

            state.movieDetail?.let {

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center) {

                    Image(
                        painter = rememberAsyncImagePainter(model = state.movieDetail.Poster),
                        contentDescription = state.movieDetail.Title,
                        modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally)
                            .size(300.dp, 300.dp)
                            .clip(RectangleShape))

                    Text(
                        text = state.movieDetail.Title,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(5.dp)
                    )
                    Text(
                        text = state.movieDetail.Year,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(5.dp)
                    )
                    Text(
                        text = state.movieDetail.Genre,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(5.dp)
                    )
                    Text(
                        text = state.movieDetail.Actors,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(5.dp)
                    )
                    Text(
                        text = state.movieDetail.Language,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(5.dp)
                    )
                    Text(
                        text = state.movieDetail.imdbRating,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(5.dp)
                    )

            }

        }
    }


}