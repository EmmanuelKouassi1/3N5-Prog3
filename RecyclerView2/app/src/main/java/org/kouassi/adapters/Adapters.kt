package org.kouassi.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import org.kouassi.Album
import org.kouassi.DetailActivity
import org.kouassi.MainActivity
import org.kouassi.databinding.ActivityMainBinding
import org.kouassi.databinding.MonItemBinding


class MonAdapter : ListAdapter<Album, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class MonItemViewHolder(private val binding: MonItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Album) {
            binding.albumName.text = item.name
            binding.artistName.text = item.artistName

            binding.btnDelete.setOnClickListener {

           val  currentList = currentList.toMutableList()


                // Modifier la liste
                currentList.remove(item)
                // Envoyer la liste
               submitList(currentList)

            }

            binding.btnActivity.setOnClickListener {
                val intent: Intent = Intent(binding.root.context, DetailActivity::class.java)
                intent.putExtra("album", item.name)
                intent.putExtra("artist", item.artistName)
                binding.root.context.startActivity(intent)
            }
        }
    }
    object PersonneItemDiffCallback : DiffUtil.ItemCallback<Album>() {
        override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
            return oldItem.name == newItem.name &&
                    oldItem.artistName== newItem.artistName
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding = MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: Album = getItem(position)
        holder.bind(item)
    }

}

object MonItemDiffCallback : DiffUtil.ItemCallback<Album>() {
    override fun areItemsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Album, newItem: Album): Boolean {
        return oldItem == newItem
    }
}