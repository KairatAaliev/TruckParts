package com.example.truckparts.stock_fragment.page_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.truckparts.R
import com.example.truckparts.stock_fragment.adapter.StockAdapter
import com.example.truckparts.then_delete.StockModel

class StockRVFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    var adapter: StockAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stock_r_v, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = StockAdapter()
        recyclerView = requireView().findViewById(R.id.recycler_view_stock)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
        adapter?.setData(getStockList())
    }

    private fun getStockList(): List<StockModel> {
        val list: ArrayList<StockModel> = arrayListOf()

        list.add(
            StockModel(
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fblogflaviomusa.medium.com%2Flanguage-and-clothing-b20ecbdf0d3d&psig=AOvVaw35BeNQqDWtr3lpy2klt_-f&ust=1641879276352000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKCw74q7pvUCFQAAAAAdAAAAABAJ",
                "Акция на все продукты до 27 февраля. Успейте приобрести пер...",
                "12.02.2020"
            )
        )
        list.add(
            StockModel(
                "",
                "Акция на все продукты до 27 февраля.",
                "12.02.2020"
            )
        )
        list.add(
            StockModel(
                "https://www.google.com/url?sa=i&url=https%3A%2F%2Fblogflaviomusa.medium.com%2Flanguage-and-clothing-b20ecbdf0d3d&psig=AOvVaw35BeNQqDWtr3lpy2klt_-f&ust=1641879276352000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKCw74q7pvUCFQAAAAAdAAAAABAJ",
                "Акция на все продукты до 27 февраля. Успейте приобрести пер...",
                "12.02.2020"
            )
        )

        return list
    }

}