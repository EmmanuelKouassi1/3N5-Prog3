package org.kouassi

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
        Log.i("allo","Mon super message yo")
        }
    }
