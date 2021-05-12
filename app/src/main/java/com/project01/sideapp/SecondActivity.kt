package com.project01.sideapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_activity)

        val bundle: Bundle? = intent.extras
        val msg = bundle?.getString("user_message")

        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

        txtviewUserMessage.text = msg

        btnSharetoOtherApps.setOnClickListener {

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, msg)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to:"))


        }




    }




}