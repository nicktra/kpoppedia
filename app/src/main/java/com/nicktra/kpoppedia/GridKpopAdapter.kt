package com.nicktra.kpoppedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridKpopAdapter(val listKpop: ArrayList<Kpop>) : RecyclerView.Adapter<GridKpopAdapter.GridViewHolder>() {
    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    private lateinit var onItemClickCallback: GridKpopAdapter.OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: GridKpopAdapter.OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, p1: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_kpop, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKpop.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listKpop[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listKpop[holder.adapterPosition]) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Kpop)
    }
}