package com.idea3d.alkemy_challenge.core.vo

import com.google.gson.GsonBuilder
import com.idea3d.alkemy_challenge.domain.WebService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



object RetrofitClient {

    val webService by lazy{
        Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)

    }

}