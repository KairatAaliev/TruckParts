package com.example.truckparts.stock_fragment.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.truckparts.R
import com.example.truckparts.then_delete.StockModel

class StockAdapter : RecyclerView.Adapter<StockAdapter.ViewHolder>() {

    var stocks: List<StockModel> = arrayListOf()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(stocks: List<StockModel>){
        this.stocks = stocks
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var image: ImageView = itemView.findViewById(R.id.iv_stock_and_news_banner_in_rv)
        var description: TextView = itemView.findViewById(R.id.tv_stock_and_news_description_in_rv)
        var date: TextView = itemView.findViewById(R.id.tv_stock_and_news_published_date_in_rv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_stock_item,parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.description.text = stocks[position].description
        holder.date.text = stocks[position].date
        holder.image.let { Glide.with(holder.itemView.context).load(stocks[position].url).into(it) }
    }

    override fun getItemCount() = stocks.size
}