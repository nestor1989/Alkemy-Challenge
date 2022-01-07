package com.idea3d.alkemy_challenge.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.idea3d.alkemy_challenge.R
import com.idea3d.alkemy_challenge.data.DataSource
import com.idea3d.alkemy_challenge.databinding.ActivityMainBinding
import com.idea3d.alkemy_challenge.domain.RepoImpl
import com.idea3d.alkemy_challenge.ui.viewmodel.MainViewModel
import com.idea3d.alkemy_challenge.ui.viewmodel.VMFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController



    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_Alkemy_challenge)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        //NavigationUI.setupActionBarWithNavController(this, navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }
}
