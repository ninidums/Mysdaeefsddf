package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.newbottom)
        val controller = findNavController(R.id.nav_host_fragment)


        setOf<Int>(
            R.id.nicefragment1,
            R.id.nicefragment2,
            R.id.nicefragment3,
            R.id.nicefragment4

        )
        setupActionBarWithNavController(controller)
        bottomNavigationView.setupWithNavController(controller)




    }

}