package com.example.quitsmokingapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quitsmokingapp.R
import com.example.quitsmokingapp.onboarding.screen.*
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            CongratScreen(),
            ApproachScreen(),
            InformationScreen(),
            MotivationScreen(),
            ParticipationScreen(),
            StopDateScreen(),
            CigarettesDayScreen(),
            CigarettesPackScreen(),
            CurrencyPriceScreen()
        )

        val adapter = ViewPagerAdapter(fragmentList,requireActivity().supportFragmentManager,lifecycle)

        view.viewPager.adapter = adapter


        return view
    }

}