package com.example.truckparts.other_fragments.history_of_accruals.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.truckparts.R

class HistoryOfAccrualsAdapter : RecyclerView.Adapter<HistoryOfAccrualsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tvBigIndicate: TextView = itemView.findViewById(R.id.tv_big_bonus_status_indicator)
        val tvDateIndicate: TextView = itemView.findViewById(R.id.tv_date_indicate_in_history)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_bonus_history_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}