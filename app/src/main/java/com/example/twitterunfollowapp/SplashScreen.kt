package com.example.twitterunfollowapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        app_logo_splash_screen.animate().alpha(1.0F).setDuration(5000)
        app_name_splash_screen.animate().translationY(-100F).setDuration(5000)

    }
}