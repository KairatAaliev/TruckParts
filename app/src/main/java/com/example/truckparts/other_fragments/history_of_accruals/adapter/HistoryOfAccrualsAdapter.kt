package com.example.truckparts.other_fragments.history_of_accruals.adapter

import android.annotation.SuppressLint
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.truckparts.R
import com.example.truckparts.then_delete.HistoryOfAccrualsModel
import com.example.truckparts.then_delete.setTextColorResource

class HistoryOfAccrualsAdapter : RecyclerView.Adapter<HistoryOfAccrualsAdapter.ViewHolder>() {

    var bonuses: List<HistoryOfAccrualsModel> = arrayListOf()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(bonuses: List<HistoryOfAccrualsModel>){
        this.bonuses = bonuses
        notifyDataSetChanged()
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var tvBigIndicate: TextView = itemView.findViewById(R.id.tv_big_bonus_status_indicator)
        var tvDateIndicate: TextView = itemView.findViewById(R.id.tv_date_indicate_in_history)
        var tvDateTime: TextView = itemView.findViewById(R.id.tv_date_time_indicate)
        var tvOrganizationName: TextView =
            itemView.findViewById(R.id.tv_organization_name_in_history_of_bonus)
        var tvOrganizationAddress: TextView =
            itemView.findViewById(R.id.tv_address_organization_in_history_of_bonus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_bonus_history_item, parent, false)
        return ViewHolder(itemView)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvBigIndicate.text = bonuses[position].bonus

        if (bonuses[position].bonus!!.startsWith("-", 0)) {
            holder.tvBigIndicate.setTextColorResource(R.color.red)
        }else{
            holder.tvBigIndicate.setTextColorResource(R.color.green)
        }
        holder.tvOrganizationName.text = bonuses[position].name
        holder.tvOrganizationAddress.text = bonuses[position].adress
        holder.tvDateIndicate.text = bonuses[position].date
        holder.tvDateTime.text = bonuses[position].time
    }

    override fun getItemCount() = bonuses.size

}

//