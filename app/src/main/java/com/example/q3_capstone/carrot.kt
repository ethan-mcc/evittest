package com.example.q3_capstone

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.ShareCompat
import androidx.navigation.fragment.navArgs
import com.example.q3_capstone.databinding.FragmentCarrotBinding

const val revenue = "textView4"

class carrot : Fragment() {
    private lateinit var binding: FragmentCarrotBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentCarrotBinding.inflate(layoutInflater)


        if (savedInstanceState != null) {
            carScore = savedInstanceState.getInt(revenue, 0)
        }


    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(revenue, carScore)

    }
    var carScore = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_carrot, container, false)
    }

}