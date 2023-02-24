package com.example.draggerdipractices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.draggerdipractices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    private lateinit var userResistration: UserResistration
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val emailServices = EmailServices()
        val userRepository = UserRepository()

        userResistration = UserResistration(userRepository, emailServices)


        userResistration.resisterEmail("Gaddar", "gaddarkumar7447")

    }
}