package com.example.quitsmokingapp.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.quitsmokingapp.R

class ApproachScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.screen_approach, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        view.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return view
    }

}