package com.example.navapp

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity


import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*
import kotlinx.android.synthetic.main.activity_main7.*

class Main7Activity : AppCompatActivity() {

    var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        btnReiniciar2.setOnClickListener {
            val intent: Intent = Intent(this, Main7Activity::class.java)
            startActivity(intent)


        }

        btnVolver7.setOnClickListener {
            val intent: Intent = Intent(this, Main5Activity::class.java)
            startActivity(intent)
            finish()

        }

        value.setText("" + id)

        plusBtn.setOnClickListener {
            value.setText("" + ++id)
        }

        minusBtn.setOnClickListener {
            value.setText("" + --id)

        }
    }
}
