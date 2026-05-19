package com.example.parctiva.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parctiva.databinding.ActivityLoginBinding
import com.example.parctiva.ui.model.StaticData

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = StaticData.login
        binding.emailValue.text = data.email
        binding.passwordValue.text = data.passwordMask
        binding.forgotPassword.text = data.forgotPasswordLabel
        binding.appleButton.text = data.socialButtons[0]
        binding.googleButton.text = data.socialButtons[1]

        binding.loginButton.setOnClickListener {
            startActivity(Intent(this, LocationActivity::class.java))
        }
    }
}
