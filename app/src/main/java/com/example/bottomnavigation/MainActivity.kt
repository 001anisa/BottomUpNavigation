package com.example.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomnavigation.adapter.ItemAdapter
import com.example.bottomnavigation.data.DataResources
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)//to have menu item in bottom
        val navController=supportFragmentManager.findFragmentById(R.id.fragmentContainerView)?.findNavController()//main fragment -the controller
        navController?.let { bottomNavigationView.setupWithNavController(it) }
        val appBarConfiguration= AppBarConfiguration(setOf(
            R.id.firstFragment,
            R.id.secondFragment,
            R.id.thirdFragment
        ))
        navController?.let { setupActionBarWithNavController(it,appBarConfiguration) }

        navController?.let { bottomNavigationView.setupWithNavController(it) }

        val myDataset = DataResources().loadBanners()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview1)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true)
        }




}