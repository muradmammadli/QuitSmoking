package com.example.quitsmokingapp.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.quitsmokingapp.R
import kotlinx.android.synthetic.main.screen_participation.view.*

class ParticipationScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.screen_participation, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        view.letsDoThisBtn.setOnClickListener {
            viewPager?.currentItem = 5
        }

        return view
    }


}