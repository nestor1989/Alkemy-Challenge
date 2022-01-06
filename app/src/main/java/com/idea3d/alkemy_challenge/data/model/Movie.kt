package com.idea3d.alkemy_challenge.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Movie(
    @SerializedName("title")
    val titulo:String,
    @SerializedName("popularity")
    val popularidad:Float,
    @SerializedName("original_language")
    val idioma: String,
    @SerializedName("release_date")
    val estreno:String,
    @SerializedName("poster_path")
    val imagen: String,
    @SerializedName("overview")
    val descripcion:String
    ): Parcelable

data class MoviesList(
    @SerializedName("results")
    val movieList: List<Movie>
)