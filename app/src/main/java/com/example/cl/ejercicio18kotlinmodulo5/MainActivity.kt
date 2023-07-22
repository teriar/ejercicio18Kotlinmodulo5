package com.example.cl.ejercicio18kotlinmodulo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cl.ejercicio18kotlinmodulo5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGuardar.setOnClickListener(View.OnClickListener {
            val entero = binding.inputEntero.text.toString().toInt()
            val texto = binding.inputTexto.toString()
            val decimal = binding.inputDecimal.toString().toDouble()
            val switch:Boolean = binding.switch1.isChecked
        })
    }
}