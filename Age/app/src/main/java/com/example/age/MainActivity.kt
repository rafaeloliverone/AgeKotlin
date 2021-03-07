package com.example.age

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etName: EditText
    private lateinit var etYear: EditText
    private lateinit var btCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etName = findViewById<EditText>(R.id.etName)
        this.etYear = findViewById<EditText>(R.id.etYear)
        this.btCalculate = findViewById<Button>(R.id.btCalculate)

        btCalculate.setOnClickListener()   {
            val name = etName.text.toString()
            val year = etYear.text.toString()

            if ( name !== "" && year !== "") {
                val person = Pessoa(name, year.toInt())
                val intent = Intent(this, ShowYear::class.java)
                intent.putExtra("person", person)
                startActivity(intent)

            } else {
                Log.i("APP_YEAR", "Preencha todos os campos");
            }

        }

    }
}