package com.bmajik.daggerhiltsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.bmajik.daggerhiltsample.databinding.ActivityMainBinding
import com.bmajik.daggerhiltsample.ui.HomeFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val mFragment = HomeFragment()
        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()
        ft.add(binding.fragmentContainer.id, mFragment).commit()
        setContentView(binding.root)
    }
}