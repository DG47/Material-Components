package com.example.android.materialcomponents.components

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AccelerateDecelerateInterpolator
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.materialcomponents.R
import com.example.android.materialcomponents.adapters.ComponentsAdapter
import com.example.android.materialcomponents.adapters.NavigationIconClickListener
import kotlinx.android.synthetic.main.activity_backdrop.*

class BackdropActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_backdrop)
        setSupportActionBar(backdrop_tb)
        backdrop_tb?.setNavigationOnClickListener(
            NavigationIconClickListener(this,
            backdrop_nsv,
            AccelerateDecelerateInterpolator(),
            ContextCompat.getDrawable(applicationContext!!, R.drawable.ic_menu_24), // Menu open icon
            ContextCompat.getDrawable(applicationContext!!, R.drawable.ic_close_white_24dp))
        )

        val rvComponents = backdrop_rv
        val componentsAdapter = ComponentsAdapter(this)
        rvComponents.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rvComponents.layoutManager = LinearLayoutManager(this)
        rvComponents.adapter = componentsAdapter

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            backdrop_nsv.background = applicationContext?.getDrawable(R.drawable.shr_product_grid_background_shape)
        }

    }
}
