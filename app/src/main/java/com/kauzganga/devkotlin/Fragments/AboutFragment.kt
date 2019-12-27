package com.kauzganga.devkotlin.Fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController

import com.kauzganga.devkotlin.R
import com.kauzganga.devkotlin.databinding.FragmentAboutBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val bindingObj = DataBindingUtil.inflate<FragmentAboutBinding>(inflater,R.layout.fragment_about,container,false)
        bindingObj.buttonHome.setOnClickListener { view -> view.findNavController().navigate(R.id.action_aboutFragment_to_homeFragment) }
        return bindingObj.root
    }


}
