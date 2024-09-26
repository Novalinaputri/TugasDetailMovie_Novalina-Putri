package com.NovalinaPutri.tugas2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.NovalinaPutri.tugas2.R.id.rv_buah
import com.NovalinaPutri.tugas2.adapter.BuahAdapter
import com.NovalinaPutri.tugas2.model.MockList
import com.NovalinaPutri.tugas2.model.ModelBuah

class RecyleBuahImageActivity : AppCompatActivity() {

    private  lateinit var  rv_buah : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recyle_buah_image)
         rv_buah = findViewById(R.id.rv_buah)

        rv_buah.layoutManager =GridLayoutManager(this, 1,
            GridLayoutManager.VERTICAL,false)

        val  adapter = BuahAdapter(MockList.getModel() as ArrayList<ModelBuah>,this)
        rv_buah.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rv_buah)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}