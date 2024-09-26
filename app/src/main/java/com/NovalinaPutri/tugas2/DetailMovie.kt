package com.NovalinaPutri.tugas2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMovie : AppCompatActivity() {
    private lateinit var txtDetailMovie : TextView
    private lateinit var imageDetailmovie : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_movie)

        txtDetailMovie = findViewById(R.id.txtDetailMovie)
        imageDetailmovie = findViewById(R.id.imgDetailMovie)

        //get data
        val detailText = intent.getStringExtra("judul")
        val detaiImg = intent.getIntExtra("image", 0)

        txtDetailMovie.setText(detailText)
        imageDetailmovie.setImageResource(detaiImg)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

