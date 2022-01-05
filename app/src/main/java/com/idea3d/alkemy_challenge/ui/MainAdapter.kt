package com.idea3d.alkemy_challenge.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.idea3d.alkemy_challenge.core.BaseViewHolder
import com.idea3d.alkemy_challenge.data.model.Movie
import com.idea3d.alkemy_challenge.databinding.MoviesRowBinding

class MainAdapter(private val context: Context, private val moviesList:List<Movie>,
    private val itemClickListener:OnMovieClickListener):
    RecyclerView.Adapter<BaseViewHolder<*>>() {

    interface OnMovieClickListener{
        fun onMovieClick(movie:Movie)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        val itemBinding =
           MoviesRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MainViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        when(holder){
            is MainViewHolder->holder.bind(moviesList[position])
        }
    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    inner class MainViewHolder(private val itemBinding: MoviesRowBinding):
        BaseViewHolder<Movie>(itemBinding.root) {
        override fun bind(item: Movie) {
            Glide.with(context).load(item.imagen).centerCrop().into(itemBinding.ivPortada)
            itemBinding.tvtitulo.text=item.titulo
            itemBinding.tvDesc.text=item.genero
            itemView.setOnClickListener {itemClickListener.onMovieClick(item)}
        }
    }
}