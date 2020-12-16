package com.example.displayalert

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception
import java.text.SimpleDateFormat
import java.time.*
import java.util.*
import kotlin.math.abs

class Calculateyearmonth : AppCompatActivity() {
    private lateinit var etDob: EditText
    private lateinit var tvDob: TextView;

    private lateinit var etDoj: EditText
    private lateinit var tvDoj: TextView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculateyearmonth)
        etDob = findViewById(R.id.etDob)
        tvDob = findViewById(R.id.tvDob)

        etDoj=findViewById(R.id.etDoj)
        tvDoj=findViewById(R.id.tvDoj)

        etDob.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog = DatePickerDialog(
                this,
                { view, years, months, dayOfMonths ->

                    val yearss = year - years;
                    val mos = month - months;
                    val dayss = dayOfMonths - day;
                    tvDob.setText("$yearss year $mos months $dayss days");
                },
                year,
                month,
                day
            )
            datePickerDialog.show();
        }

        etDoj.setOnClickListener {
            val c = Calendar.getInstance()
            val year = c.get(Calendar.YEAR)
            val month = c.get(Calendar.MONTH)
            val day = c.get(Calendar.DAY_OF_MONTH)
            val datePickerDialog = DatePickerDialog(
                this,
                { view, years, months, dayOfMonths ->

                    val yearss = year - years;
                    val mos = month - months;
                    val dayss = dayOfMonths - day;
                    tvDoj.setText("$yearss year $mos months $dayss days");
                },
                year,
                month,
                day
            )
            datePickerDialog.show();
        }
    }

}