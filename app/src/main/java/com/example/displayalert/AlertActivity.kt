package com.example.displayalert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var edtnum1:EditText
    lateinit var edtnum2:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        button=findViewById(R.id.button)
        edtnum1=findViewById(R.id.edtnum1);
        edtnum2=findViewById(R.id.edtnum2);

        button.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My alert")
            builder.setMessage("Are you sure")

            builder.setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("yes") { _, _ ->

                Toast.makeText(applicationContext,"Sum is ${add()}", Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No") { _, _ ->
                Toast.makeText(applicationContext, "Clicked No", Toast.LENGTH_LONG).show()
            }
            val alertDialog: AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()


        }

    }
    private fun add():Int{
        val f:Int=edtnum1.text.toString().toInt()
        val s:Int=edtnum2.text.toString().toInt()
        return (f+s)
        
    }
}