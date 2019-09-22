package com.example.android.materialcomponents.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.materialcomponents.R
import kotlinx.android.synthetic.main.activity_fab.*

class FABActivity : AppCompatActivity() {

    private var fabExpanded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fab)
        setSupportActionBar(fab_activity_tb)

        fabSetting.setOnClickListener {
            if (fabExpanded) {
                closeSubMenusFab()
            } else {
                openSubMenusFab()
            }
        }
    }

    private fun openSubMenusFab() {
        layoutFabSave.visibility = View.VISIBLE
        layoutFabEdit.visibility = View.VISIBLE
        layoutFabPhoto.visibility = View.VISIBLE
        fabSetting.setImageResource(R.drawable.ic_close_black_24dp)
        fabExpanded = true
    }

    private fun closeSubMenusFab() {
        layoutFabSave.visibility = View.INVISIBLE
        layoutFabEdit.visibility = View.INVISIBLE
        layoutFabPhoto.visibility = View.INVISIBLE
        fabSetting.setImageResource(R.drawable.ic_settings_black_24dp)
        fabExpanded = false
    }
}
