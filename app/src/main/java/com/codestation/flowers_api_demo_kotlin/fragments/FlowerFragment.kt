package com.codestation.flowers_api_demo_kotlin.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.codestation.flowers_api_demo_kotlin.R
import com.codestation.flowers_api_demo_kotlin.databinding.FragmentFlowerBinding


class FlowerFragment : Fragment() {

    private lateinit var binding: FragmentFlowerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFlowerBinding.inflate(inflater, container, false)

        return binding.root
    }


}