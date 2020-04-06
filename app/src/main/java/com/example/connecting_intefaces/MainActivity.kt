package com.example.connecting_intefaces

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonProfile = findViewById<Button>(R.id.idBtnViewProfile) // finds the button
        // Note: Use the second option for listener, had issues with the first one.
        buttonProfile.setOnClickListener {
            var action = Intent(this,Main2Activity::class.java) // Sets up the action
            startActivity(action) // connection
        }


    }
}
