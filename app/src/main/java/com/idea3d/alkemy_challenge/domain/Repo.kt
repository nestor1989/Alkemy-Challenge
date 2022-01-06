package com.idea3d.alkemy_challenge.domain

import com.idea3d.alkemy_challenge.data.model.Movie
import com.idea3d.alkemy_challenge.core.vo.Resource

interface Repo {

    suspend fun getMoviesList(drinkName:String): Resource<List<Movie>>

}