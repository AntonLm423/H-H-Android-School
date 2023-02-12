package com.example.homework2_task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<FirstFragment>(R.id.frameLayoutMain)
            }
        
        val buttonFirst = findViewById<Button>(R.id.buttonFirst)
        val buttonSecond = findViewById<Button>(R.id.buttonSecond)
        val buttonThird = findViewById<Button>(R.id.buttonThird)

        buttonFirst.setOnClickListener() {
            supportFragmentManager.commit { replace(R.id.frameLayoutMain, FirstFragment()) }
        }

        buttonSecond.setOnClickListener() {
            supportFragmentManager.commit { replace(R.id.frameLayoutMain, SecondFragment()) }
        }

        buttonThird.setOnClickListener() {
            supportFragmentManager.commit { replace(R.id.frameLayoutMain, ThirdFragment()) }
        }
    }




}