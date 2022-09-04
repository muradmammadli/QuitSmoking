package com.example.quitsmokingapp.onboarding.screen

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.DatePicker
import androidx.viewpager2.widget.ViewPager2
import com.example.quitsmokingapp.R
import kotlinx.android.synthetic.main.screen_stop_date.view.*
import java.text.SimpleDateFormat
import java.util.*


class StopDateScreen : Fragment(),DatePickerDialog.OnDateSetListener {

    private val calendar = Calendar.getInstance()
    private val formatter = SimpleDateFormat("MMMM dd yyyy",Locale.US)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.screen_stop_date, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        view.letsDoThisBtn.setOnClickListener {
            viewPager?.currentItem = 6
        }

        view.date_btn.setOnClickListener {
            DatePickerDialog(requireContext(),this,
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH),
                calendar.get(Calendar.DAY_OF_MONTH)
            ).show()
        }

        view.today_btn.setOnClickListener {
            val currentDate = formatter.format(Date())
            view?.date_btn?.text = currentDate
            Log.d("TODAY BTN CLICKED", currentDate)
        }


        return view
    }

    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
        Log.d("CALENDAR", "onDateSet: $p1 --- $p2 --- $p3")
        calendar.set(p1,p2,p3)
        displayFormattedData(calendar.timeInMillis)
    }


    private fun displayFormattedData(timeStamp: Long){
        view?.date_btn?.text = formatter.format(timeStamp)
    }


}