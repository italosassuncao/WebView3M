package com.example.webview3m

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.WebSettings
import com.example.webview3m.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.webview.loadUrl("https://www.unicid.edu.br/")
        val webSettings: WebSettings = binding.webview.getSettings()
        webSettings.javaScriptEnabled = true
    }
}