package org.kouassi

import adapters.MonAdapter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import org.kouassi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.i("allo","Mon super message yo")
        fillRecycler()
        setupRecycler()
        }

    private lateinit var adapter: MonAdapter // L'adapteur est accessible partout dans notre classe


    private fun fillRecycler() {
       val items: MutableList<String> = mutableListOf()
        for (i in 1..10000) {
            items.add("Item #$i")
        }
        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur
    }

    private fun setupRecycler() {
        adapter = MonAdapter() // Créer l'adapteur
        binding.rvMonAdapter.adapter = adapter // Assigner l'adapteur au RecyclerView
        binding.rvMonAdapter.setHasFixedSize(true) // Option pour améliorer les performances
        binding.rvMonAdapter.addItemDecoration( // Ajouter un séparateur entre chaque élément
            DividerItemDecoration(
                binding.rvMonAdapter.context, DividerItemDecoration.VERTICAL
            )
        )
    }
    }
