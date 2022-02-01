package com.example.ejemplotabbedactivity.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CollectionAdapter(fm: FragmentActivity, fragments: List<Fragment>) :
    FragmentStateAdapter(fm) {
    private val fragments = fragments
    override fun getItemCount(): Int {
        return fragments.size;
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }
}

