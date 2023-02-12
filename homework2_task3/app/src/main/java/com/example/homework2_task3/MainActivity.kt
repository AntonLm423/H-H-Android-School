package com.example.homework2_task3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<FirstFragment>(R.id.frameLayoutFirst)
        }

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<SecondFragment>(R.id.frameLayoutSecond)
        } }
    }




