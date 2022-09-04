package com.example.quitsmokingapp.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.quitsmokingapp.R
import kotlinx.android.synthetic.main.screen_information.view.*


class InformationScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.screen_information, container, false)

        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)


        view.letsDoThisBtn.setOnClickListener {
            viewPager?.currentItem = 3
//            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
//            onBoardingFinished()
        }
        return view
    }

//    private fun onBoardingFinished(){
//        val sharedPref = requireActivity().getSharedPreferences("onBoarding",Context.MODE_PRIVATE)
//        val editor = sharedPref.edit()
//        editor.putBoolean("Finished",true)
//        editor.apply()
//    }
}