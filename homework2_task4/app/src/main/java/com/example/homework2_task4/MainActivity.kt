package com.example.homework2_task4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {

    lateinit var textViewActivity : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewActivity = findViewById(R.id.textViewActivity)
        textViewActivity.append("\nOnCreate")

        Log.i("ActivityLifecycle", "onCreate")

        supportFragmentManager.commit {
            setReorderingAllowed(true)
            add<MainFragment>(R.id.frameLayoutMain) }
    }

    override fun onStart() {
        super.onStart()
        textViewActivity.append("\nOnStart")
        Log.i("ActivityLifecycle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        textViewActivity.append("\nOnResume")
        Log.i("ActivityLifecycle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        textViewActivity.append("\nOnPause")
        Log.i("ActivityLifecycle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        textViewActivity.append("\nOnStop")
        Log.i("ActivityLifecycle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        textViewActivity.append("\nOnDestroy")
        Log.i("ActivityLifecycle", "onDestroy")
    }
}