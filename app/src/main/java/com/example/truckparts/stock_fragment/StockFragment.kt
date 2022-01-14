package com.example.truckparts.stock_fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.truckparts.stock_fragment.adapter.ViewPagerAdapter
import androidx.annotation.Nullable
import com.example.truckparts.MainActivity


abstract class StockFragment : Fragment() {

    lateinit var viewPager: ViewPager
    abstract val mainActivity: MainActivity

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        return inflater.inflate(R.layout.fragment_stock, container, false)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        viewPager = requireView().findViewById(R.id.viewPager)
//        viewPager.adapter = adapter
//    }

    @SuppressLint("InflateParams")
    @Nullable
    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("AAAA", "dfsjudfjnsdnflskndf")
        val view = inflater.inflate(com.example.truckparts.R.layout.fragment_stock, null)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("AAA", "ViewPagerlsdfmgsdmfklgm")


            Log.e("AAA", "ViewPager")
            viewPager = view.findViewById(com.example.truckparts.R.id.viewPager) as ViewPager
            val adapter = ViewPagerAdapter(mainActivity.getSupportFragmentManager())
            viewPager.setAdapter(adapter)


    }
}