package com.example.cl.ejercicio18kotlinmodulo5

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cl.ejercicio18kotlinmodulo5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mSharedPreferences:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        mSharedPreferences = getSharedPreferences("cookie",Context.MODE_PRIVATE)
        binding.btnGuardar.setOnClickListener(View.OnClickListener {
            val entero = binding.inputEntero.text.toString().toInt()
            val texto = binding.inputTexto.text.toString()
            val decimal = binding.inputDecimal.text.toString().toFloat()
            val switch:Boolean = binding.switch1.isChecked

            guardarDatos(texto,decimal,entero,switch)
        })

        binding.btnMostrarValores.setOnClickListener(View.OnClickListener {

            mostrarDatos()
        })

        binding.btnBorrar.setOnClickListener(View.OnClickListener {
            borrarDatos()
        })
    }

    private fun borrarDatos() {
        binding.txtTexto.text = ""
        binding.txtEntero.text = ""
        binding.txtDecimal.text = ""
        binding.switch1.isChecked = false



        mSharedPreferences.edit().clear().apply()
    }

    private fun mostrarDatos() {
       val text = mSharedPreferences.getString("miTexto","")
        val decimal = mSharedPreferences.getFloat("mi Double",0.0f)
        val entero = mSharedPreferences.getInt("mi Entero",0)
        val boleano = mSharedPreferences.getBoolean("mi boleano",false)

        binding.txtTexto.text = text
        binding.txtEntero.text = entero.toString()
        binding.txtDecimal.text = decimal.toString()
        binding.txtSwitch.text = boleano.toString()

        binding.switch1.isChecked = boleano

    }

    private fun guardarDatos(text:String,decimal:Float,entero:Int,boleano:Boolean) {
        mSharedPreferences.edit().putString("miTexto",text).apply()
        mSharedPreferences.edit().putInt("mi Entero",entero).apply()
        mSharedPreferences.edit().putFloat("mi Double", decimal).apply()
        mSharedPreferences.edit().putBoolean("mi boleano", boleano).apply()

    }
}