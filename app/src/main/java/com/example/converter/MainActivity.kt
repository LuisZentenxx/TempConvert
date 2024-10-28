package com.example.converter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnClear : Button
    private lateinit var btnFahrenheit : Button
    private lateinit var btnCelsius : Button
    private lateinit var btnRankine : Button
    private lateinit var btnReaumur : Button
    private lateinit var etFahrenheit : EditText
    private lateinit var etCelsius : EditText
    private lateinit var etRankine : EditText
    private lateinit var etKelvin : EditText
    private lateinit var etReaumur : EditText

    @SuppressLint("DefaultLocale")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClear = findViewById(R.id.btnClear)
        btnFahrenheit = findViewById(R.id.btnFahrenheit)
        btnCelsius = findViewById(R.id.btnCelsius)
        btnRankine = findViewById(R.id.btnRankine)
        btnReaumur = findViewById(R.id.btnReaumur)
        etFahrenheit = findViewById(R.id.etFahrenheit)
        etCelsius = findViewById(R.id.etCelsius)
        etRankine = findViewById(R.id.etRankine)
        etKelvin = findViewById(R.id.etKelvin)
        etReaumur = findViewById(R.id.etReaumur)

        // Fahrenheit to
        val fhrToCelsius: (Float) -> Float = { (it - 32) * 5/9 }
        val fhrToRankine: (Float) -> Float = { it + 459.67f }
        val fhrToKelvin: (Float) -> Float = { (it - 32) * 5/9 + 273.15f }
        val fhrToReaumur: (Float) -> Float = { (it -32) * 4/9 }

        // Celsius to
        val clsToFahrenheit: (Float) -> Float = { (it * 9/5) + 32 }
        val clsToRankine: (Float) -> Float = { (it + 273.15f) * 9/5 }
        val clsToKelvin: (Float) -> Float = { it + 273.15f }
        val clsToReaumur: (Float) -> Float = { it * 4/5 }

        // Rankine to
        val rnkToFahrenheit: (Float) -> Float = { it - 459.67f }
        val rnkToCelsius: (Float) -> Float = { (it - 491.67f) * 5/9 }
        val rnkToKelvin: (Float) -> Float = { it * 5/9 }
        val rnkToReaumur: (Float) -> Float = { (it - 491.67f) * 4/9 }

        // Kelvin to

        // Reaumur to

        btnFahrenheit.setOnClickListener {
            var textInput = etFahrenheit.text.toString()

            if (textInput.isNotEmpty()) {

                val fahrenheit = textInput.toFloat()

                val celsius = converter(fahrenheit, fhrToCelsius)
                val rankine = converter(fahrenheit, fhrToRankine)
                val kelvin = converter(fahrenheit, fhrToKelvin)
                val reaumur = converter(fahrenheit, fhrToReaumur)

                etCelsius.setText(String.format("%.2f",celsius))
                etRankine.setText(String.format("%.2f",rankine))
                etKelvin.setText(String.format("%.2f",kelvin))
                etReaumur.setText(String.format("%.2f",reaumur))

            } else {
                etCelsius.setText("")
                etRankine.setText("")
                etKelvin.setText("")
                etReaumur.setText("")
            }
        }

        btnCelsius.setOnClickListener {
            var textInput = etCelsius.text.toString()

            if (textInput.isNotEmpty()) {

                val celsius = textInput.toFloat()

                val fahrenheit = converter(celsius, clsToFahrenheit)
                val rankine = converter(celsius, clsToRankine)
                val kelvin = converter(celsius, clsToKelvin)
                val reaumur = converter(celsius, clsToReaumur)

                etFahrenheit.setText(String.format("%.2f", fahrenheit))
                etRankine.setText(String.format("%.2f", rankine))
                etKelvin.setText(String.format("%.2f", kelvin))
                etReaumur.setText(String.format("%.2f", reaumur))

            } else {
                etFahrenheit.setText("")
            }
        }

        btnRankine.setOnClickListener {
            var textInput = etRankine.text.toString()

            if (textInput.isNotEmpty()) {

                val rankine = textInput.toFloat()

                val fahrenheit = converter(rankine, rnkToFahrenheit)
                val celsius = converter(rankine, rnkToCelsius)
                val kelvin = converter(rankine, rnkToKelvin)
                val reaumur = converter(rankine, rnkToReaumur)

                etFahrenheit.setText(String.format("%.2f", fahrenheit))
                etCelsius.setText(String.format("%.2f", celsius ))
                etKelvin.setText(String.format("%.2f", kelvin))
                etReaumur.setText(String.format("%.2f", reaumur))

            }else{
                etFahrenheit.setText("")
                etCelsius.setText("")
                etRankine.setText("")
                etKelvin.setText("")
                etReaumur.setText("")
            }
        }
        btnClear.setOnClickListener {
            etFahrenheit.setText("")
            etCelsius.setText("")
            etRankine.setText("")
            etKelvin.setText("")
            etReaumur.setText("")
        }


        }
    }

private fun converter(t: Float, convertion:(Float) -> Float) = convertion(t)

