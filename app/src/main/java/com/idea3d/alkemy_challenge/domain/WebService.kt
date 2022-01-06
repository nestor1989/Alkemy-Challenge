package com.idea3d.alkemy_challenge.domain

import com.idea3d.alkemy_challenge.core.Constantes.Companion.API_KEY
import com.idea3d.alkemy_challenge.data.model.Movie
import com.idea3d.alkemy_challenge.data.model.MoviesList
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {
    @GET("movie/popular?api_key=$API_KEY")
    suspend fun GetMovieByName(@Query("movieName")movieName:String):MoviesList
}