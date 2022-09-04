package com.example.quitsmokingapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quitsmokingapp.bottomnavfragment.Day100Fragment
import com.example.quitsmokingapp.bottomnavfragment.HealtFragment
import com.example.quitsmokingapp.bottomnavfragment.NumbersFragment
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import java.text.SimpleDateFormat
import java.util.*


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val numbersFragment = NumbersFragment()
        val healthFragment = HealtFragment()
        val day100Fragment = Day100Fragment()
        replaceFragment(numbersFragment)

        view.bottom_nav_view.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(NumbersFragment())
                R.id.health -> replaceFragment(HealtFragment())
                R.id.day100 -> replaceFragment(Day100Fragment())
            }
            true
        }


        return view
    }

    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout,fragment)
            commit()

        }


    }
}