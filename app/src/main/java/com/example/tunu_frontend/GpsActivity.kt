package com.example.tunu_frontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class GpsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gps)

        accept.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            // start your next activity
            startActivity(intent)
        }
    }
}
