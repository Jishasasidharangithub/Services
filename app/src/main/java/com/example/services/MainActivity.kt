package com.example.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.services.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.apply {
            btnStart?.setOnClickListener {
                startService(Intent(this@MainActivity,MyService::class.java))
            }

            btnStop?.setOnClickListener {
                stopService(Intent(this@MainActivity,MyService::class.java))
            }
        }
    }
}