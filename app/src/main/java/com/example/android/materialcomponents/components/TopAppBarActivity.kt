package com.example.android.materialcomponents.components

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.materialcomponents.R
import com.example.android.materialcomponents.adapters.ComponentsAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_top_app_bar.*

class TopAppBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_app_bar)
        setSupportActionBar(top_app_bar_tb)

        top_app_bar_ctb.setExpandedTitleColor(Color.WHITE)
        top_app_bar_ctb.setCollapsedTitleTextColor(Color.WHITE)

        val rvComponents = top_app_bar_rv
        val componentsAdapter = ComponentsAdapter(this)
        rvComponents.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rvComponents.layoutManager = LinearLayoutManager(this)
        rvComponents.adapter = componentsAdapter
    }
}
