package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var bt:Button
    lateinit var tx1:EditText
    lateinit var tx2:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt=findViewById(R.id.button)
        tx1=findViewById(R.id.editTextTextPersonName)
        tx2=findViewById(R.id.editTextTextPersonName2)

        bt.setOnClickListener {
            Toast.makeText(this, "${tx1.text} ${tx2.text} " , Toast.LENGTH_LONG).show()

        }
        }
    }
