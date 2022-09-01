package com.rosariobagaskara.moviecatalog

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieDataAdapter(private val movieList: ArrayList<MovieData>): RecyclerView.Adapter<MovieDataAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_movie_vertical, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = movieList[position]
        holder.movieImage.setImageResource(currentItem.image)
        holder.movieTitle.text = currentItem.title
        holder.movieDate.text = currentItem.date
        holder.movieRating.text = currentItem.rating.toString()
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val movieImage = itemView.findViewById<ImageView>(R.id.movieImageView)
        val movieTitle = itemView.findViewById<TextView>(R.id.movieTitleTextView)
        val movieDate = itemView.findViewById<TextView>(R.id.dateTextView)
        val movieRating = itemView.findViewById<TextView>(R.id.ratingTextView)
        val movieDescription = itemView.findViewById<TextView>(R.id.descriptionTextView)
    }

}