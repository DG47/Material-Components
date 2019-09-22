package com.example.android.materialcomponents.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.materialcomponents.R
import com.example.android.materialcomponents.adapters.ComponentsAdapter
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_bottom_app_bar.*

class BottomAppBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_app_bar)
        setSupportActionBar(bottom_app_bar_bar)

        bottom_app_bar_bar.setNavigationOnClickListener {
            Snackbar.make(it,"Bottom AppBar item clicked",Snackbar.LENGTH_SHORT)
                .setAnchorView(bottom_app_bar_fab)
                .show()
        }
    }
}
