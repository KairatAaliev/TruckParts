package com.example.truckparts.other_fragments.history_of_accruals

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.truckparts.R
import com.example.truckparts.other_fragments.history_of_accruals.adapter.HistoryOfAccrualsAdapter
import com.example.truckparts.then_delete.HistoryOfAccrualsModel


class HistoryOfAccrualsFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    var adapter: HistoryOfAccrualsAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_history_of_accruals, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = HistoryOfAccrualsAdapter()
        recyclerView = requireView().findViewById(R.id.rv_history_of_accruals_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
        adapter?.setData(getBonusList())
    }

    private fun getBonusList(): List<HistoryOfAccrualsModel> {
        val list: ArrayList<HistoryOfAccrualsModel> = arrayListOf()
        list.add(
            HistoryOfAccrualsModel(
                "+25",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект чынгыза Айтматова, 109 а, Кыргызстан, переулок второй за третьим..."
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "+25",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект чынгыза Айтматова, 109 а, Кыргызстан, переулок второй за третьим..."
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "-35",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект Чуй, 109 а, Кыргызстан"
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "-10",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект чынгыза Айтматова, 109 а, Кыргызстан, переулок второй за третьим..."
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "+30",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект Чуй, 109 а, Кыргызстан"
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "+60",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект чынгыза Айтматова, 109 а, Кыргызстан, переулок второй за третьим..."
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "-60",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект Чуй, 109 а, Кыргызстан"
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "+35",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект чынгыза Айтматова, 109 а, Кыргызстан, переулок второй за третьим..."
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "+40",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект Чуй, 109 а, Кыргызстан"
            )
        )
        list.add(
            HistoryOfAccrualsModel(
                "-70",
                "sto",
                "12.02.2020",
                "12:35",
                "Бишкек, проспект чынгыза Айтматова, 109 а, Кыргызстан, переулок второй за третьим..."
            )
        )

        return list
    }
}