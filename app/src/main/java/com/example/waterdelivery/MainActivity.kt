package com.example.waterdelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val loginbutton = findViewById<Button>(R.id.logInButton)

        loginbutton.setOnClickListener {
            val intent = Intent(this,SignUpActivity ::class.java)
            startActivity(intent)
        }
    }
}
