package com.idea3d.alkemy_challenge.core

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.idea3d.alkemy_challenge.databinding.MoviesRowBinding

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: T)
}