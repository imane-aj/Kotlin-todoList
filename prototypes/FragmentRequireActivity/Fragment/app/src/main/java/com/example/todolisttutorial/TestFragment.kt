package com.example.todolisttutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.todolisttutorial.databinding.FragmentTestBinding

class TestFragment : Fragment() {


    private lateinit var binding: FragmentTestBinding

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?,savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // val activity = requireActivity() as MainActivity
       //  activity.title = "Example Fragment"

        // Do any other setup for the fragment here
    }

}