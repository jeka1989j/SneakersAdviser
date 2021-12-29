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
            val spinnerBrands = findViewById<Spinner>(R.id.sneakers_brand_spinner)
            val setBrand = spinnerBrands.selectedItem.toString()
            val brandList = getBrands(setBrand)

            val sneakerList = brandList.reduce { str, item -> str + "\n" + item }
            val brands = findViewById<TextView>(R.id.brands)
            brands.text = sneakerList
        }
    }

    fun getBrands(brand: String): List<String> {
        return when(brand) {
            "Supra" -> listOf("Mushka","Bandit", "Society")
            "Adidas" -> listOf("Stan Smith", "Samba")
            "Puma" -> listOf("Suede","Porshe")
            "Nike" -> listOf("Cortez","Jordan")
            else -> listOf("Gout Stack", "Stanly Epkis")
        }
    }
}