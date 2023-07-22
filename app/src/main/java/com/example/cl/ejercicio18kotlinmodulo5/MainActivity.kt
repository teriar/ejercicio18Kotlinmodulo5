package com.example.cl.ejercicio18kotlinmodulo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cl.ejercicio18kotlinmodulo5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding =ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}