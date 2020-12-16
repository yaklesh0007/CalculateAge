package com.example.displayalert

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class LoadCalender : AppCompatActivity() {
    private lateinit var btnloadcalender:Button
    private lateinit var tvDate:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_calender)

        btnloadcalender=findViewById(R.id.btnloadcalender)
        tvDate=findViewById(R.id.tvDate)

        btnloadcalender.setOnClickListener{
            loadCalender()
        }

    }
    private fun loadCalender(){
        val c=Calendar.getInstance()
        val y=c.get(Calendar.YEAR)
        val d=c.get(Calendar.DAY_OF_YEAR)
        val m=c.get(Calendar.MONTH)

        val datepickerDialog=DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{view,year,month,dayOfMonth->
                tvDate.text="Selected Date:$dayOfMonth/${month+1}/$year"
            },
            y,
            d,
            m
        )
        datepickerDialog.show()
    }
}