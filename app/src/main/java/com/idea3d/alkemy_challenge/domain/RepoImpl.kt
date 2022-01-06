package com.idea3d.alkemy_challenge.domain

import com.idea3d.alkemy_challenge.data.DataSource
import com.idea3d.alkemy_challenge.data.model.Movie
import com.idea3d.alkemy_challenge.core.vo.Resource

class RepoImpl(private val dataSource: DataSource):Repo {
    override suspend fun getMoviesList(tragoName:String): Resource<List<Movie>> {
        return dataSource.getMovieByName(tragoName)
    }

}