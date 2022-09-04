package com.example.quitsmokingapp.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quitsmokingapp.R
import kotlinx.android.synthetic.main.screen_cigarettes_day.view.*
import kotlinx.android.synthetic.main.screen_cigarettes_day.view.letsDoThisBtn
import kotlinx.android.synthetic.main.screen_currency_price.view.*


class CurrencyPriceScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.screen_currency_price, container, false)
        view.letsDoThisBtn.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
        }
        return view
    }


}