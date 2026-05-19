package com.example.parctiva.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.parctiva.databinding.ActivityLocationBinding
import com.example.parctiva.ui.model.StaticData

class LocationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLocationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLocationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = StaticData.location
        binding.pointsBadge.text = data.points
        binding.storeTitle.text = data.storeName
        binding.locationType.text = data.addressType
        binding.streetAddress.text = data.streetAddress
        binding.favoriteHint.text = if (data.isFavorite) "В избранном" else "Не в избранном"

        val tags = listOf(binding.tagHome, binding.tagWork, binding.tagSport)
        data.tags.zip(tags).forEach { (text, view) -> view.text = text }

        binding.settingsButton.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }
}
