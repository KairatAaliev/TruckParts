package com.example.truckparts.stock_fragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.truckparts.stock_fragment.page_fragments.StockNewsRVFragment
import com.example.truckparts.stock_fragment.page_fragments.StockRVFragment

class ViewPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm){
//    override fun getItemCount(): Int {
//        return 2
//    }
//
//    override fun createFragment(position: Int): Fragment {
//        when(position){
//            0 -> return StockRVFragment()
//            1 -> return StockNewsRVFragment()
//            else -> return StockRVFragment()
//        }
//    }

    override fun getCount() = 2


    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return StockRVFragment()
            1 -> return StockNewsRVFragment()
            else -> return StockRVFragment()
        }
    }
}