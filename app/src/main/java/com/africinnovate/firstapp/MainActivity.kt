package com.africinnovate.firstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import android.widget.TextView
import java.text.SimpleDateFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        G 'at' HH:mm:ss z"

        val textView: TextView = findViewById(R.id.date)
        val simpleDateFormat = SimpleDateFormat("dd/MM/yyyy")
        val currentDateAndTime: String = simpleDateFormat.format(Date())
        textView.text = currentDateAndTime
    }
}