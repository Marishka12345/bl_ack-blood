package com.example.homeapteka


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter (fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> Apteka()
            1 -> UsefulTips()
            else -> {
                return  InRegionsOfCountry()
            }
        }
    }

    override fun getCount(): Int {
        return 3 //указывается сколько вкладок
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) { //указываются заголовки вкладок
            0 -> "Аптека"
            1 -> "Полезные советы"
            else -> {
                return "В регионах страны"
            }
        }
    }
}