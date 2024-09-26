package com.NovalinaPutri.tugas2.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.NovalinaPutri.tugas2.DetailBuah
import com.NovalinaPutri.tugas2.DetailMovie
import com.NovalinaPutri.tugas2.MovieActivity
import com.NovalinaPutri.tugas2.R
import com.NovalinaPutri.tugas2.RecyleBuahImageActivity
import com.NovalinaPutri.tugas2.adapter.BuahAdapter.MyViewHolder
import com.NovalinaPutri.tugas2.model.ModelBuah
import com.NovalinaPutri.tugas2.model.ModelMovie

class MovieAdapter constructor(
    private val getActivity: MovieActivity,
    private val movieList: List<ModelMovie>

) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtMovie: TextView = itemView.findViewById(R.id.txtmovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgmovie)
        val cardModelMovie: CardView = itemView.findViewById(R.id.cardMovie)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        holder.itemView.setOnClickListener() {
            val intent = Intent(getActivity, DetailMovie::class.java)

            intent.putExtra("image", movieList[position].image)
            intent.putExtra("judul", movieList[position].title)
            //deklarasi
            getActivity.startActivity(intent)

            holder.cardModelMovie.setOnClickListener() {
                Toast.makeText(getActivity, movieList[position].title, Toast.LENGTH_SHORT).show()
            }
        }

    }
}

