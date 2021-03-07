package com.example.age

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class ShowYear : AppCompatActivity() {
    private lateinit var etResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_year)

        this.etResult = findViewById<TextView>(R.id.etResult)

        val person = intent.getSerializableExtra("person") as Pessoa
        var name = person.name
        var year = person.calculateYear()

        this.etResult.setText("$name, você possui $year anos!")
    }
}