package com.example.tunu_frontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class PrivacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy)

        accept.setOnClickListener {
            val intent = Intent(this, GpsActivity::class.java)
            // start your next activity
            startActivity(intent)
        }

    }
}
