package com.example.displayalert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import java.nio.file.attribute.AclEntry

class MainActivity : AppCompatActivity() {
    lateinit var alert:Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        alert=findViewById(R.id.alert);

        alert.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setTitle("My alert")
            builder.setMessage("Are you sure !!")
            builder.setIcon(R.drawable.alert)
            builder.setPositiveButton("yes"){dialog, which ->
               Toast.makeText(applicationContext,"Clicked yes",Toast.LENGTH_LONG).show()
            }
            builder.setNeutralButton("Cancel"){dialog, which ->
                Toast.makeText(applicationContext,"Clicked on Cancel",Toast.LENGTH_LONG).show()
            }
            builder.setNegativeButton("No"){dialog, which ->
                Toast.makeText(applicationContext,"Clicked No",Toast.LENGTH_LONG).show()
            }

            val alertDialog:AlertDialog=builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()
        }
    }
}