package com.kauzganga.devkotlin.Fragments


import android.content.Intent
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.kauzganga.devkotlin.R
import com.kauzganga.devkotlin.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val bindingObj = DataBindingUtil.inflate<FragmentHomeBinding>(inflater,R.layout.fragment_home,container,false)
       bindingObj.buttonAbout.setOnClickListener { view -> view.findNavController().navigate(R.id.action_homeFragment_to_aboutFragment) }
        setHasOptionsMenu(true)
        return bindingObj.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.about_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.about_fragment){
           view!!   .findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
        }
        return super.onOptionsItemSelected(item)
    }


}
