package com.dsckiet.covid_tracker_android_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dsckiet.covid_tracker_android_app.utils.InternetConnectivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        if (!InternetConnectivity.isNetworkAvailable(this)!!)
            Toast.makeText(this, "Internet Unavailable", Toast.LENGTH_SHORT).show()
    }
}