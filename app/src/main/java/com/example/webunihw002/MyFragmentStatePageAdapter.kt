package com.example.webunihw002

import android.content.Intent.getIntent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import hu.bme.aut.viewpagertwodemo.FragmentPageOne
import hu.bme.aut.viewpagertwodemo.FragmentPageTwo

class MyFragmentStatePagerAdapter(activity: AppCompatActivity, val itemsCount: Int) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return itemsCount
    }




    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            FragmentPageOne.newInstance()
        } else {
            FragmentPageTwo.newInstance()
        }
    }


}