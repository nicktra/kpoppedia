package com.nicktra.kpoppedia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListKpopAdapter(private val listKpop: ArrayList<Kpop>) : RecyclerView.Adapter<ListKpopAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_kpop, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKpop.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val kpop = listKpop[position]
        Glide.with(holder.itemView.context)
            .load(kpop.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = kpop.name
        holder.tvDetail.text = kpop.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listKpop[holder.adapterPosition]) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Kpop)
    }

}