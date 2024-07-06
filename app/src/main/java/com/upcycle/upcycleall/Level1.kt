package com.upcycle.upcycleall

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.upcycle.upcycleall.databinding.ActivityLevel1Binding

class Level1 : AppCompatActivity() {
    lateinit var binding: ActivityLevel1Binding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding =  ActivityLevel1Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }
}