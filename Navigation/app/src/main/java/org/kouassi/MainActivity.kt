package org.kouassi

import android.content.Intent
import android.widget.Button
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import org.kouassi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        }

    val buttonArticle = findViewById<Button>(R.id.button_article)
    val buttonContact = findViewById<Button>(R.id.button_contact)



    }
