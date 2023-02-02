package com.example.homework1_task2

import android.content.Intent
import android.content.Intent.ACTION_DIAL
import android.content.Intent.ACTION_VIEW
import android.net.Uri
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

    // открытие ссылки
    fun openBrowser(view : View) {

        val editTextLink = findViewById<EditText>(R.id.editTextLink)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://" + editTextLink.text.toString()))

        startActivity(intent)

        }

    // открытие почты
    fun openMail(view: View) {

        val editTextAddress = findViewById<EditText>(R.id.editTextAddress)
        val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + editTextAddress.text.toString()))
        //intent.putExtra(Intent.EXTRA_TEXT, "")

        startActivity(intent)

        }

    // открытие звонилки
    fun openCallPhone(view: View) {

        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val intent = Intent(ACTION_DIAL, Uri.parse("tel:" + editTextNumber.text))

        startActivity(intent)

    }

    // открытие карты
    fun openMap(view: View) {
        val editTextCoordinates = findViewById<EditText>(R.id.editTextСoordinates)
        val intent = Intent(ACTION_VIEW, Uri.parse("geo:" + editTextCoordinates.text.toString()))

        startActivity(intent)
    }

    }





