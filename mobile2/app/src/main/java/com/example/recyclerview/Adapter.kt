package com.example.recyclerview

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.MonItemBinding

class MonAdapter : ListAdapter<Version, MonAdapter.MonItemViewHolder>(MonItemDiffCallback) {

    // binding nous permet d'accéder à tout le champs de notre layout mon_item.xml
    inner class MonItemViewHolder(private val binding: MonItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Version) {
            binding.version.text = item.android
            binding.nomVersion.text = item.version
            binding.btn.setOnClickListener {
                val intent: Intent = Intent(binding.root.context, DetailsActivity::class.java)
                intent.putExtra("version", item.android)
                intent.putExtra("nomversion", item.version)
                binding.root.context.startActivity(intent)
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonItemViewHolder {
        val binding: MonItemBinding =
            MonItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MonItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MonItemViewHolder, position: Int) {
        val item: Version = getItem(position)
        holder.bind(item)
    }

}

object MonItemDiffCallback : DiffUtil.ItemCallback<Version>() {
    override fun areItemsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Version, newItem: Version): Boolean {
        return oldItem.version == newItem.version &&
                oldItem.android == newItem.android
    }
}