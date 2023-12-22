package com.radit.sejahteraapp.ui.profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.radit.sejahteraapp.R
import com.radit.sejahteraapp.databinding.ActivityMainBinding
import com.radit.sejahteraapp.databinding.ActivityProfileBinding
import com.radit.sejahteraapp.ui.form.SurveiForm
import com.radit.sejahteraapp.ui.home.HomeActivity

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    private lateinit var nav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupAction()
    }

    private fun setupAction() {
        Log.i("setupAction", "Masukkk")
        nav = binding.bottomNav
        binding.bottomNav.setOnItemReselectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.home -> {
                    Log.i("setupAction", "Home")
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                }

                R.id.add -> {
                    Log.i("setupAction", "Add")
                    val intent = Intent(this, SurveiForm::class.java)
                    startActivity(intent)
                }

                R.id.profile -> {
                    Log.i("setupAction", "Profile")
                    val intent = Intent(this, ProfileActivity::class.java)
                    startActivity(intent)
                }
            }

        }
    }
}