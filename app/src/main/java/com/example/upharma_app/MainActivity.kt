package com.example.upharma_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.upharma_app.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btNavigation.background= null

        navController = findNavController(R.id.nav_hostHome)
        val navView = binding.btNavigation
        val appBarConfiguration = AppBarConfiguration(
            topLevelDestinationIds = setOf(R.id.homeFragment, R.id.nav_account, R.id.nav_notify, R.id.nav_support, R.id.noVisiable2)
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navController.addOnDestinationChangedListener{_, destination, _ ->
            when(destination.id){
                R.id.nav_support, R.id.nav_account, R.id.homeFragment, R.id.nav_notify, R.id.noVisiable2 -> {
                    showBottomBar()
                }else -> {
                    hideBottomBar()
                }
            }
        }
        navView.setupWithNavController(navController)
    }

    private fun hideBottomBar(){
        binding.btNavigation.visibility = View.GONE
        binding.bottomAppbar.visibility = View.GONE
        binding.floatingActionButton.visibility=View.GONE
    }

    private fun showBottomBar(){
        binding.btNavigation.visibility = View.VISIBLE
        binding.bottomAppbar.visibility = View.VISIBLE
        binding.floatingActionButton.visibility=View.VISIBLE
    }
    override fun onSupportNavigateUp(): Boolean {
        navController.navigateUp()
        return true
    }
}