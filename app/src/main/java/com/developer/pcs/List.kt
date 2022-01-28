package com.developer.pcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class List : AppCompatActivity() {
    lateinit var recylerView: RecyclerView
    lateinit var adapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        init()
        recylerView.layoutManager = LinearLayoutManager(this)
        recylerView.adapter = adapter
    }

    private fun init(){
        recylerView = findViewById(R.id.list)

        var data = ArrayList<Recycler>()
        data.add(Recycler("Chrisna"))
        data.add(Recycler("Priyandika"))
        data.add(Recycler("Suseno"))
        data.add(Recycler("Deni"))
        data.add(Recycler("Awan"))
        data.add(Recycler("Dwi"))

        adapter = MyAdapter(data)
    }
}