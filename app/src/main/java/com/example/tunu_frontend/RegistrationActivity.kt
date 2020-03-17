package com.example.tunu_frontend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.accept
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        accept.setOnClickListener {
            if (text_input.length() > 9){

                val editText = findViewById<EditText>(R.id.text_input)
//                val editTextValue = editText.text
                val intent = Intent(this, VerificationActivity::class.java)
            // start your next activity
            startActivity(intent)
            }
            else {
                text_input.setError("Not enough numbers")
            }
            }
        }
    }

