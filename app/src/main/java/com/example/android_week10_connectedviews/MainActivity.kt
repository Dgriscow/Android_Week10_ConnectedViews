package com.example.android_week10_connectedviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nextButton = findViewById<Button>(R.id.viewNext)

        nextButton.setOnClickListener {
            val nextScreen = Intent(this@MainActivity, UserInfoView::class.java)
            startActivity(nextScreen)
        }



    }
}