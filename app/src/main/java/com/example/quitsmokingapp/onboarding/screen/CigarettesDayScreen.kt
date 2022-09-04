package com.example.quitsmokingapp.onboarding.screen

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.quitsmokingapp.R
import kotlinx.android.synthetic.main.screen_cigarettes_day.view.*

class CigarettesDayScreen : Fragment() {

    private var numberOfCiga = 20
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.screen_cigarettes_day, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        view?.letsDoThisBtn?.setOnClickListener {
            viewPager?.currentItem = 7
        }

        view.cigarettes_per_day.text = numberOfCiga.toString()


        view.increase_btn.setOnClickListener {
            numberOfCiga++
            view.cigarettes_per_day.text = numberOfCiga.toString()

        }
        view.decrease_btn.setOnClickListener {
            numberOfCiga--
            view.cigarettes_per_day.text = numberOfCiga.toString()
        }


        return view
    }

}