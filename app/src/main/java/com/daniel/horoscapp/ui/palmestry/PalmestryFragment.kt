package com.daniel.horoscapp.ui.palmestry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.daniel.horoscapp.databinding.FragmentPalmestryBinding

class PalmestryFragment : Fragment() {

    private var _binding: FragmentPalmestryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPalmestryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}