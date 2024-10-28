package com.example.converter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnClear : Button
    private lateinit var btnFahrenheit : Button
    private lateinit var btnCelsius : Button
    private lateinit var btnRankine : Button
    private lateinit var btnKelvin : Button
    private lateinit var btnReaumur : Button
    private lateinit var etFahrenheit : EditText
    private lateinit var etCelsius : EditText
    private lateinit var etRankine : EditText
    private lateinit var etKelvin : EditText
    private lateinit var etReaumur : EditText
    private lateinit var btnLearn : Button

    @SuppressLint("DefaultLocale")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializa los componentes UI
       initializeUI()

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
        val klvToFahrenheit: (Float) -> Float = { (it - 273.15f) * 9/5 + 32 }
        val klvToCelsius: (Float) -> Float = { it - 273.15f }
        val klvToRankine: (Float) -> Float = { it * 9/5 }
        val klvToReaumur: (Float) -> Float = { (it - 273.15f) * 4/5 }

        // Reaumur to
        val reToFahrenheit: (Float) -> Float = { it * 5/4 }
        val reToCelsius: (Float) -> Float = { it * 9/4 + 32 }
        val reToRankine: (Float) -> Float = { it * 9/4 + 491.67f }
        val reToKelvin: (Float) -> Float = { it * 5/4 + 273.15f }

        // Fahrenheit Conversor
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

        // Celsius Conversor
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
                clearInputs()
            }
        }

        // Rankine Conversor
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

            } else{
                clearInputs()
            }
        }

        // Kelvin Conversor
        btnKelvin.setOnClickListener {
            var textInput = etKelvin.text.toString()

            if (textInput.isNotEmpty()) {

                val kelvin = textInput.toFloat()

                val fahrenheit = converter(kelvin, klvToFahrenheit)
                val celsius = converter(kelvin, klvToCelsius)
                val rankine = converter(kelvin, klvToRankine)
                val reaumur = converter(kelvin, klvToReaumur)

                etFahrenheit.setText(String.format("%.2f", fahrenheit))
                etCelsius.setText(String.format("%.2f", celsius))
                etRankine.setText(String.format("%.2f", rankine))
                etReaumur.setText(String.format("%.2f", reaumur))

            } else {
                clearInputs()
            }
        }

        // Réaumur Conversor
        btnReaumur.setOnClickListener {
            var textInput = etReaumur.text.toString()

            if (textInput.isNotEmpty()) {

                val reaumur = textInput.toFloat()

                val fahrenheit = converter(reaumur, reToFahrenheit)
                val celsius = converter(reaumur, reToCelsius)
                val rankine = converter(reaumur, reToRankine)
                val kelvin = converter(reaumur, reToKelvin)

                etFahrenheit.setText(String.format("%.2f", fahrenheit))
                etCelsius.setText(String.format("%.2f", celsius))
                etRankine.setText(String.format("%.2f", rankine))
                etKelvin.setText(String.format("%.2f", kelvin))

            } else {
                clearInputs()
            }
        }

        // Botón Limpiar
        btnClear.setOnClickListener {
            clearInputs()
        }

        // Botón Intent
        btnLearn.setOnClickListener {

        }

        }

    private fun converter(t: Float, convertion:(Float) -> Float) = convertion(t)

    // Función que inicializa los componentes UI
    private fun initializeUI(){
        btnClear = findViewById(R.id.btnClear)
        btnFahrenheit = findViewById(R.id.btnFahrenheit)
        btnCelsius = findViewById(R.id.btnCelsius)
        btnRankine = findViewById(R.id.btnRankine)
        btnKelvin = findViewById(R.id.btnKelvin)
        btnReaumur = findViewById(R.id.btnReaumur)
        etFahrenheit = findViewById(R.id.etFahrenheit)
        etCelsius = findViewById(R.id.etCelsius)
        etRankine = findViewById(R.id.etRankine)
        etKelvin = findViewById(R.id.etKelvin)
        etReaumur = findViewById(R.id.etReaumur)
        btnLearn = findViewById(R.id.btnLearn)
    }

    // Función que limpia todos los campos Edit Text
    private fun clearInputs() {
        etFahrenheit.setText("")
        etCelsius.setText("")
        etRankine.setText("")
        etKelvin.setText("")
        etReaumur.setText("")
    }
}




