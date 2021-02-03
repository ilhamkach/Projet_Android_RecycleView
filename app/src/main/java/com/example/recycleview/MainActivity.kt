package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader

class MainActivity : AppCompatActivity() {
    private var layoutManager: RecyclerView.LayoutManager?=null
    private  val arraylist  = ArrayList<items>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById(R.id.recycler) as RecyclerView
        var string: String? = ""
        val stringBuilder = StringBuilder()
        val `is`: InputStream = this.resources.openRawResource(R.raw.dictionary)
        val reader = BufferedReader(InputStreamReader(`is`))


        var count_img = 0
        var img_tab = arrayOf(
            R.drawable.savoir,
            R.drawable.homee,
            R.drawable.langage,
            R.drawable.philo,
            R.drawable.internet,
            R.drawable.enfent,
            R.drawable.stylo,
            R.drawable.prof,
            R.drawable.etudiant,
            R.drawable.text,
            R.drawable.programmation,
            R.drawable.mainframe,
            R.drawable.os)

        while(true) {
            try {
                if (reader.readLine().also { string = it } == null) break
            } catch (e: IOException) {
                e.printStackTrace()
            }
            val values = string?.split(":")
            arraylist.add(items(values?.get(0),values?.get(1),img_tab[count_img]))
            count_img++

        }
        `is`.close()



        Toast.makeText(this,"Bienvenue dans notre Dictionnaire", Toast.LENGTH_SHORT).show()

        val myadapter=Adapter(arraylist,this)
        layoutManager= LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=myadapter
    }
}
