package com.swfusioncoding.instagramclone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.swfusioncoding.instagramclone.R
import kotlinx.android.synthetic.main.photo_list_item.view.*

class OneAdapter(items: ArrayList<Int>) : RecyclerView.Adapter<OneAdapter.OneViewHolder>(){

    var items = items

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = OneViewHolder((parent))

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: OneViewHolder, position: Int) {
        holder.imageView_photo.setImageResource(items.get(0))
    }

    inner class OneViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder
        (LayoutInflater.from(parent.context).inflate(R.layout.photo_list_item, parent, false)){

        val imageView_photo = itemView.imageView_photo
    }
}