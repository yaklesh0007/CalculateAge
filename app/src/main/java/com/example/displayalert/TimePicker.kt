package com.example.displayalert

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class TimePicker : AppCompatActivity() {
    private lateinit var btnloadtime:Button
    private lateinit var txttime:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_picker)
        btnloadtime=findViewById(R.id.btnloadtime)
        txttime=findViewById(R.id.txttime)

        btnloadtime.setOnClickListener{
            val c= Calendar.getInstance()
            val hour=c.get(Calendar.HOUR_OF_DAY)
            val minute=c.get(Calendar.MINUTE)


            val timePickerDialog=TimePickerDialog(this,TimePickerDialog.OnTimeSetListener{timePicker,hour,minute->
                txttime.text="$hour:$minute"
            },
                hour,
                minute,
                true
            )
            timePickerDialog.show()
        }

    }
}