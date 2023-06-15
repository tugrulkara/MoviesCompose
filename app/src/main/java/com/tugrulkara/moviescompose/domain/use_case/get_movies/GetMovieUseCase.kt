package com.tugrulkara.moviescompose.domain.use_case.get_movies

import com.tugrulkara.moviescompose.data.remote.dto.MoviesDto
import com.tugrulkara.moviescompose.data.remote.dto.toMovieList
import com.tugrulkara.moviescompose.domain.model.Movie
import com.tugrulkara.moviescompose.domain.repository.MovieRepository
import com.tugrulkara.moviescompose.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(private val repository:MovieRepository) {

    fun executeGetMovies(search:String) : Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading())
            val movies = repository.getMovies(search)
            if (movies.Response.equals("True")){
                emit(Resource.Success(movies.toMovieList()))
            }else{
                emit(Resource.Error("No Movie Found"))
            }

        }catch (e: Exception){
            emit(Resource.Error("Error"))
        }
    }
}