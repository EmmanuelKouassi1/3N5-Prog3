package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DividerItemDecoration
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MonAdapter // L'adapteur est accessible partout dans notre classe


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        title ="Versions"
        setupRecycler()
        fillRecycler()

    }
    
        private fun setupRecycler() {
            adapter = MonAdapter() // Créer l'adapteur
            binding.rvPersonneAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
            binding.rvPersonneAdapter.setHasFixedSize(true) // Option pour améliorer les performances
            binding.rvPersonneAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
                DividerItemDecoration(
                    binding.rvPersonneAdapter.context, DividerItemDecoration.VERTICAL
                ))
    }
    private fun fillRecycler() {
        val items: MutableList<Version> = mutableListOf(
            Version("Android 1.1", "Que"),
            Version("Android 1.1", "Com"),
            Version("Android 1.1", "Qu"),
            Version("Android 1.1", "Pou"),
                Version("Android 1.1", "Qu"),
                Version("Android 1.1", "Comm"),
                Version("Android 1.1", "Que"),
                Version("Android 1.1", "Pour"),
            Version("Android 1.1", "Qu"),
            Version("Android 1.1", "Comm"),
            Version("Android 1.1", "Que"),
            Version("Android 1.1", "Pour"),)
                
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }

}
