package com.example.currencyexchangerates

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var usdInrTextView: TextView
    private lateinit var cadInrTextView: TextView
    private lateinit var eurInrTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usdInrTextView = findViewById(R.id.usdInr)
        cadInrTextView = findViewById(R.id.cadInr)
        eurInrTextView = findViewById(R.id.eurInr)

        // Setting static default values
        usdInrTextView.text = "USD: 82.50"
        cadInrTextView.text = "CAD: 65.00"
        eurInrTextView.text = "EUR: 90.00"
    }
}
