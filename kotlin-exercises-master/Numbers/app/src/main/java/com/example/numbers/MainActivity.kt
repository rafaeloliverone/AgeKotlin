package com.example.numbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvNumbers: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvNumbers = findViewById<TextView>(R.id.tvNumbers)
        this.tvNumbers.text = Megasena.getInstance().joinToString(" ")

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            this.tvNumbers.text = Megasena.getInstance().joinToString(" ")
            Log.i("APP_NUMBERS", this.tvNumbers.text.toString())
        }

    }
}