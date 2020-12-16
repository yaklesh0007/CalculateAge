package com.example.displayalert

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class ShowAM_PM : AppCompatActivity() {
    private lateinit var btnloadtime: Button
    private lateinit var txttime: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_a_m__p_m)

        btnloadtime=findViewById(R.id.btnloadtime)
        txttime=findViewById(R.id.txttime)

        btnloadtime.setOnClickListener {
            val c = Calendar.getInstance()
            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minute = c.get(Calendar.MINUTE)
            val timePickerDialog =
                TimePickerDialog(
                    this, TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                        if(hour>=0 && hour<12) {
                            txttime.text = "$hour:$minute AM"
                        }
                        else if(hour>12 && hour<24){

                            txttime.text="$hour:$minute PM"
                        }
                    },
                    hour,
                    minute,
                    false


                )

            timePickerDialog.show()
        }
    }
}