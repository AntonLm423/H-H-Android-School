package com.example.homework1_task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openHelloActivity(view: View) {
        val editTextName = findViewById<EditText>(R.id.editTextName)

        if(editTextName.text.isEmpty()) {
            Toast.makeText(this, "Сначала введите имя!", Toast.LENGTH_SHORT)
            return
        }

        val intent = Intent(this, HelloActivity::class.java)

        intent.putExtra("key_name", editTextName.text.toString())

        startActivity(intent)
    }
}