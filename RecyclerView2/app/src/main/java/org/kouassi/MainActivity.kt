package org.kouassi

import android.content.Intent
import org.kouassi.adapters.MonAdapter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import org.kouassi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: MonAdapter // L'adapteur est accessible partout dans notre classe
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecycler()
        fillRecycler()
        title ="Nice"

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

    private fun fillRecycler() {
        val items: MutableList<Album> = mutableListOf(  Album(id = 1, name = "PONA NINI", artistName = "Génézio"),
                Album(id = 2, name = "CABREL", artistName = "Saaro"),
            Album(id = 3, name = "PROTECT", artistName = "Merveille"),
            Album(id = 4, name = "PSYCHOLOGIQUE", artistName = "Polo G"),
            Album(id = 5, name = "PLAISIR NOCIF", artistName = "SDM"),
            Album(id = 6, name = "MANON B", artistName = "Tiakola"),
            Album(id = 7, name = "WOW", artistName = "Zola"),
            Album(id = 8, name = "FASTE LIFE", artistName = "Future"),
            Album(id = 9, name = "RESTE LÀ", artistName = "Kbd"),
            Album(id = 10, name = "Y.J", artistName = "Lloris"),
            Album(id = 11, name = "GRAND PRIX", artistName = "RK"),
            Album(id = 12, name = "DERNIÈRE DANSE", artistName = "Bouss"),
            Album(id = 13, name = "1H55", artistName = "MHD")
            )

        adapter.submitList(items) // Pour changer le contenu de la liste, utiliser submitList de l'adapteur

    }
    }
