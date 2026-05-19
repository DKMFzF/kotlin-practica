package com.example.parctiva.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parctiva.databinding.ActivitySettingsBinding
import com.example.parctiva.ui.model.StaticData

class SettingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener { finish() }

        val account = StaticData.settings[0]
        binding.accountTitle.text = account.title
        binding.accountItem1.text = account.items[0]
        binding.accountItem2.text = account.items[1]
        binding.accountItem3.text = account.items[2]
        binding.accountItem4.text = account.items[3]

        val mapSection = StaticData.settings[1]
        binding.mapTitle.text = mapSection.title
        binding.mapItem1.text = mapSection.items[0]
        binding.mapItem2.text = mapSection.items[1]

        val trigger = StaticData.settings[2]
        binding.triggerTitle.text = trigger.title
        binding.triggerItem1.text = trigger.items[0]
        binding.triggerItem2.text = trigger.items[1]
        binding.triggerItem3.text = trigger.items[2]
    }
}
