package com.example.tablayoutkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.ejemplotabbedactivity.ui.main.CollectionAdapter
import com.example.ejemplotabbedactivity.ui.main.MarsFragment
import com.example.ejemplotabbedactivity.ui.main.NeptuneFragment
import com.example.ejemplotabbedactivity.ui.main.SaturnFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lista= listOf(NeptuneFragment(),SaturnFragment(),MarsFragment())

        val collectionAdapter = CollectionAdapter(this,lista)
        val viewPager: ViewPager2 = findViewById(R.id.viewPager2)
        viewPager.adapter = collectionAdapter

        val tabs: TabLayout = findViewById(R.id.tabLayout)

        TabLayoutMediator(tabs, viewPager) { tab, position ->
            tab.text = resources.getStringArray(R.array.planets)[position]
        }.attach()

    }
}