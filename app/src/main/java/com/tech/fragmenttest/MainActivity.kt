package com.tech.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_home.setOnClickListener {

            //to show fragment into frame layout
            var fmanager = supportFragmentManager
            var tx = fmanager.beginTransaction()
            tx.add(R.id.my_frame, HomeFragment())
            tx.commit()

        }

        btn_about_us.setOnClickListener {
            //to show fragment into frame layout
            var fmanager = supportFragmentManager
            var tx = fmanager.beginTransaction()
            tx.replace(R.id.my_frame, Aboutus_Fragment())
            tx.commit()
        }
    }
}