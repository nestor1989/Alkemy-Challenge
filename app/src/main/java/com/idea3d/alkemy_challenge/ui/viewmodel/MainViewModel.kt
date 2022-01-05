package com.idea3d.alkemy_challenge.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.idea3d.alkemy_challenge.data.DataSource
import com.idea3d.alkemy_challenge.domain.Repo
import com.idea3d.alkemy_challenge.vo.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val repo:Repo):ViewModel() {

    val fetchMoviesList= liveData(Dispatchers.IO) {
        emit(Resource.Loading())
        try {
            emit(repo.getMoviesList())
        }catch (e:Exception){
            emit(Resource.Failure(e))
        }
    }
}