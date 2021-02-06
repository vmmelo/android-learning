package com.example.aboutme

import android.content.ClipData
import android.content.ClipboardManager
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Get the clipboard system service
        val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager


        binding.copyToClipboard.setOnClickListener {
            Log.d("UIWIDGETS", "Texto copiado!")
            val textToCopy = binding.bioText.text
            val clip = ClipData.newPlainText("Teste", textToCopy)
            clipboard.setPrimaryClip(clip)
            Toast.makeText(
                //this,
                applicationContext,//Application
                "Texto copiado para área de transferência",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}