package com.example.homework1_task1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openRedActivity(view: View) {

        val intent = Intent(this, RedActivity::class.java);
        startActivity(intent);

    }

    fun openGreenActivity(view: View) {

        val intent = Intent(this, GreenActivity::class.java);
        startActivity(intent);

    }

    fun openBlueActivity(view: View) {

        val intent : Intent = Intent(this, BlueActivity::class.java);
        startActivity(intent);

    }

}

