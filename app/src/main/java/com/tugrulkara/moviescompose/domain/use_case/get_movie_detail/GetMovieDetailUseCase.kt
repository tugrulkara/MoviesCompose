package com.tugrulkara.moviescompose.domain.use_case.get_movie_detail

import com.tugrulkara.moviescompose.data.remote.dto.toMovieDetail
import com.tugrulkara.moviescompose.domain.model.MovieDetail
import com.tugrulkara.moviescompose.domain.repository.MovieRepository
import com.tugrulkara.moviescompose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetMovieDetailUseCase @Inject constructor(private val repository: MovieRepository) {

    fun executeGetMovieDetails(imdbId:String) : Flow<Resource<MovieDetail>> = flow {

        try {
            emit(Resource.Loading())

            val movieDetail=repository.getMovieDetail(imdbId)
            emit(Resource.Success(movieDetail.toMovieDetail()))

        }catch (e:Exception){
            emit(Resource.Error("Error"))
        }

    }

}