package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.recyclerview.databinding.ActivityDetailsBinding
import com.example.recyclerview.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    private lateinit var adapter: MonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Détails"
        if(intent.hasExtra("version")) {
            binding.tvVersion.text = intent.getStringExtra("version")
        }
        if(intent.hasExtra("nomversion")) {
            binding.tvNomVersion.text = intent.getStringExtra("nomversion")
        }


    }
}