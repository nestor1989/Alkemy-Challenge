package com.idea3d.alkemy_challenge.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.idea3d.alkemy_challenge.R
import com.idea3d.alkemy_challenge.data.model.Movie
import com.idea3d.alkemy_challenge.databinding.FragmentDetailsBinding
import com.idea3d.alkemy_challenge.databinding.FragmentMainBinding

class DetailsFragment : Fragment() {
    private var _binding: FragmentDetailsBinding? = null
    private val binding get() = _binding!!

    private lateinit var movie:Movie

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requireArguments().let{
            movie=it.getParcelable("movie")!!
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(requireContext()).load("https://image.tmdb.org/t/p/w500/${movie.imagen}").centerCrop().into(_binding!!.imageView)
        _binding!!.tvTitle.text=movie.titulo
        _binding!!.tvDesc.text=movie.descripcion
    }
}