package com.idea3d.alkemy_challenge.domain

import com.idea3d.alkemy_challenge.data.DataSource
import com.idea3d.alkemy_challenge.data.model.Movie
import com.idea3d.alkemy_challenge.vo.Resource

class RepoImpl(private val dataSource: DataSource):Repo {
    override fun getMoviesList(): Resource<List<Movie>> {
        return dataSource.getMoviesList()
    }

}