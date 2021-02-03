package com.example.recycleview

import android.content.Context
import android.graphics.Color
import android.graphics.text.LineBreaker.JUSTIFICATION_MODE_INTER_WORD
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row.view.*

class Adapter (val arrayList: ArrayList<items>, val context: Context): RecyclerView.Adapter<Adapter.ViewHolder>() {


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){


        fun bindItem(item :items){
            val textViewName = itemView.findViewById(R.id.titre1) as TextView
            val textViewDef  = itemView.findViewById(R.id.def1) as TextView
            val image = itemView.findViewById(R.id.img1) as ImageView
            textViewName.text = item.titre
            textViewDef.text = item.definition
            image.setImageResource(item.imageResource)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.row,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(arrayList[position])
        holder.itemView.setOnClickListener {
            if(position==0){
                Toast.makeText(context,"Savoir", Toast.LENGTH_SHORT).show()
            }
            if(position==1){
                Toast.makeText(context,"Maison", Toast.LENGTH_SHORT).show()

            }
            if(position==2){
                Toast.makeText(context,"Langage", Toast.LENGTH_SHORT).show()

            }
            if(position==3){
                Toast.makeText(context,"Philosophe", Toast.LENGTH_SHORT).show()

            }
            if(position==4){
                Toast.makeText(context,"Internet", Toast.LENGTH_SHORT).show()

            }
            if(position==5){
                Toast.makeText(context,"Enfant", Toast.LENGTH_SHORT).show()

            }
            if(position==6){
                Toast.makeText(context,"Stylo", Toast.LENGTH_SHORT).show()

            }
            if(position==7){
                Toast.makeText(context,"Professeur", Toast.LENGTH_SHORT).show()

            }
            if(position==8){
                Toast.makeText(context,"Etudiant", Toast.LENGTH_SHORT).show()

            }
            if(position==9){
                Toast.makeText(context,"Texte", Toast.LENGTH_SHORT).show()

            }
            if(position==10){
                Toast.makeText(context,"Programmation", Toast.LENGTH_SHORT).show()

            }
            if(position==11){
                Toast.makeText(context,"MainFrame", Toast.LENGTH_SHORT).show()

            }
            if(position==12){
                Toast.makeText(context,"Systéme d'exploitation", Toast.LENGTH_SHORT).show()

            }
        }
    }



}