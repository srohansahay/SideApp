package com.project01.sideapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {

            Log.i("MainActivity","Button is clicked")

            Toast.makeText(this,"Button is clicked",Toast.LENGTH_SHORT).show()


        }

        btnsendtexttoNextActivity.setOnClickListener {


            val message: String = etPersonName.text.toString()
            //Toast.makeText(this,message,Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)


            intent.putExtra("user_message", message)
            startActivity(intent)

        }

        recyclerView.setOnClickListener {

            val intent = Intent( this, HobbiesActivity::class.java)
            startActivity(intent)

        }



    }
}