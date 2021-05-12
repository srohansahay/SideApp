package com.project01.sideapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_hobby.*

class HobbiesActivity: AppCompatActivity() {

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

       setContentView(R.layout.activity_hobby)


        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation= LinearLayoutManager.VERTICAL


        recyclerview.layoutManager = layoutManager


        val adapter = HobbiesAdapter(this, Hobby.Supplier.hobbies)
           recyclerview.adapter = adapter

    }


}