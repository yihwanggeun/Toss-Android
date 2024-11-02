package com.skku.toss

import android.content.res.ColorStateList
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ScrollingView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.setPadding
import androidx.core.widget.NestedScrollView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.skku.toss.presentation.ListRowC1
import com.skku.toss.presentation.ListRowV1
import com.skku.toss.presentation.ListRowV2
import com.skku.toss.ui.BenefitFragment
import com.skku.toss.ui.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var currentFragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.container)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu_home ->{
                    showFragment(HomeFragment())
                    true
                }
                R.id.menu_benefit->{
                    showFragment(BenefitFragment())
                    true
                }
                R.id.menu_pay->{
                    true
                }
                R.id.menu_asset->{
                    true
                }
                R.id.menu_total->{
                    true
                }
                else -> false
            }
        }

        showFragment(HomeFragment())

    }

    private fun showFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container, fragment)
            .commit()
        currentFragment = fragment

    }
}

