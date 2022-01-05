package com.idea3d.alkemy_challenge.domain

import com.idea3d.alkemy_challenge.data.model.Movie
import com.idea3d.alkemy_challenge.vo.Resource

interface Repo {

    fun getMoviesList(): Resource<List<Movie>>

}