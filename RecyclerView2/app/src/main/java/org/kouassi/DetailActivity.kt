package org.kouassi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.kouassi.adapters.MonAdapter
import org.kouassi.databinding.ActivityDetailBinding
import org.kouassi.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var adapter: MonAdapter // L'adapteur est accessible partout dans notre classe
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title = "Nice"
        if(intent.hasExtra("album")) {
            binding.tvAlbumName.text = intent.getStringExtra("album")
        }
        if(intent.hasExtra("artist")) {
            binding.tvArtistName.text = intent.getStringExtra("artist")
        }


    }
}