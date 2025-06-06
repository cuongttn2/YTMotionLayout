package com.example.ytmotionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivityDiagonal : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagonal_list)
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = DummyAdapter()
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}