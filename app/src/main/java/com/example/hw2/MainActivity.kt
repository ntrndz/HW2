package com.example.hw2

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("CHECKDONGU", "onCreate()")
    }

    override fun onStart() {
        super.onStart()
        Log.e("CHECKDONGU", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.e("CHECKDONGU", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.e("CHECKDONGU", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.e("CHECKDONGU", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("CHECKDONGU", "onDestroy()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("CHECKDONGU", "onRestart()")
    }



}
