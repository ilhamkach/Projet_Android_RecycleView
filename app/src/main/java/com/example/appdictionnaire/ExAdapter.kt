package com.example.appdictionnaire

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_splash_screen.view.*
import kotlinx.android.synthetic.main.items.view.*

class ExAdapter:RecyclerView.Adapter<ExAdapter.ExViewHolder>() {



    private val itemTitles= arrayOf("Savoir:")
    private val itemDetails= arrayOf("Avoir appris quelque chose, et pouvoir le dire, le connaître, le répéter.")
    private val itemImages= intArrayOf(
        R.drawable.maison
    )
    inner class ExViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var image:ImageView
        var textTitle:TextView
        var textDes:TextView
        init {
            image=itemView.findViewById(R.id.img1)
            textTitle=itemView.findViewById(R.id.titre1)
            textDes=itemView.findViewById(R.id.def1)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExViewHolder {
        val v=LayoutInflater.from(parent.context)
            .inflate(R.layout.items,parent,false)
        return ExViewHolder(v)
    }

    override fun onBindViewHolder(holder: ExViewHolder, position: Int) {
        holder.textTitle.text=itemTitles[position]
        holder.textDes.text=itemDetails[position]
        holder.image.setImageResource(itemImages[position])
    }
    override fun getItemCount(): Int {
        return itemTitles.size
    }
}