package com.example.homework1_task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HelloActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val intent = getIntent();
        if(intent != null)
        {
            val textViewHello = findViewById<TextView>(R.id.textViewHello)
            textViewHello.text = "Hello, " + intent.getStringExtra("key_name").toString()
        }
    }


}