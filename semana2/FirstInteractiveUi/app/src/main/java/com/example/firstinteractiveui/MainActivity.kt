package com.example.firstinteractiveui

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.firstinteractiveui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mCount = 0

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonToast.setOnClickListener {
            Log.d("UIWIDGETS", "Toast clicado!")
            Toast.makeText(
                //this,
                applicationContext,//Application
                R.string.toast_message,
                Toast.LENGTH_SHORT
            ).show()
        }

        binding.buttonCount.setOnClickListener {
            Log.d("UIWIDGETS", "Count clicado!")
            mCount++
            binding.showCount.text = mCount.toString()
        }
    }
}