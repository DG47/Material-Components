package com.example.android.materialcomponents.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.materialcomponents.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_chips.*

class ChipsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chips)

        chip_entry_ib.setOnClickListener { refresh() }

        chip_entry_chip1.setOnCloseIconClickListener { it.visibility = View.GONE }

        chip_entry_chip2.setOnCloseIconClickListener { it.visibility = View.GONE }

        playMusicChip.setOnClickListener {
            Snackbar.make(chip_cl,"Playing music.",Snackbar.LENGTH_SHORT).show()
        }

        setAlarmChip.setOnClickListener {
            Snackbar.make(chip_cl,"Alarm is set.",Snackbar.LENGTH_SHORT).show()
        }

        turnLightsOnChip.setOnClickListener {
            Snackbar.make(chip_cl,"Lights are on.",Snackbar.LENGTH_SHORT).show()
        }
    }

    private fun refresh() {

        chip_entry_chip1.visibility = View.VISIBLE
        chip_entry_chip2.visibility = View.VISIBLE
    }
}
