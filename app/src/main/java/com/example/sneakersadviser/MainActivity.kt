package com.example.sneakersadviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val chooseBrand = findViewById<Button>(R.id.choose_brand)
        chooseBrand.setOnClickListener {
            val brands = findViewById<TextView>(R.id.brands)
            val spinnerBrands = findViewById<Spinner>(R.id.sneakers_brand_spinner)
//            val setBrand = spinnerBrands.selectedItem.toString()
            val setBrand = spinnerBrands.selectedItem.toString()
            brands.text = "Sneakers brands is $setBrand"
        }
    }
}