package com.codestation.flowers_api_demo_kotlin.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codestation.flowers_api_demo_kotlin.databinding.FragmentFlowersListBinding


class FlowersListFragment : Fragment() {
    private lateinit var binding: FragmentFlowersListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFlowersListBinding.inflate(inflater, container, false)
        return binding.root
    }

}