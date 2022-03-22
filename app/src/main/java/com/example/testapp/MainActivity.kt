package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val city1 = City("Moscow", -5)
        city1.temperature = -15

        val buttonButton = findViewById<Button>(R.id.button)
        val textviewTextview = findViewById<TextView>(R.id.textview)
        buttonButton.setOnClickListener {
            if (textviewTextview.text == city1.toString()) {
                Toast.makeText(this, textviewTextview.text, Toast.LENGTH_SHORT).show()
            } else {
                textviewTextview.text = city1.toString()
            }
        }

        val buttonCityCopy = findViewById<Button>(R.id.city_copy)
        buttonCityCopy.setOnClickListener {
            textviewTextview.text = Repository.copyCity().toString()
        }
    }
}
