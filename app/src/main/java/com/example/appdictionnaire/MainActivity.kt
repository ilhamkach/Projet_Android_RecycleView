package com.example.appdictionnaire

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Size
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
     private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<ExAdapter.ExViewHolder>?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Bonjour a notre Dictionnaire",Toast.LENGTH_SHORT).show()
 layoutManager=LinearLayoutManager(this)
        recycler.layoutManager=layoutManager
        adapter=ExAdapter()
        recycler.adapter=adapter
    }

}

