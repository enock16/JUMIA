package com.example.codefestshopapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SPLASH : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)




        Handler().postDelayed({
            // add startActivity start with current Act ,then next //
            startActivity(Intent(this@SPLASH,MainActivity::class.java))

            finish()
            // time delays//
        },4000)

    }

}
