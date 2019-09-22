package com.example.android.materialcomponents

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.materialcomponents.adapters.ComponentsAdapter
import com.example.android.materialcomponents.components.*
import com.example.android.pets.RecyclerItemClickListener
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(main_activity_tb)

        val rvComponents = main_activity_rv
        val componentsAdapter = ComponentsAdapter(this, false)
        rvComponents.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        rvComponents.layoutManager = LinearLayoutManager(this)
        rvComponents.adapter = componentsAdapter

        startActivitiesOnClick(rvComponents)
    }

    private fun startActivitiesOnClick(rvComponents: RecyclerView) {
        rvComponents.addOnItemTouchListener(
            RecyclerItemClickListener(this, rvComponents,
                object : RecyclerItemClickListener.OnItemClickListener {
                    override fun onItemLongClick(view: View?, position: Int) {
                        view?.let { onItemClick(it, position) }
                    }

                    override fun onItemClick(view: View, position: Int) {
                        createIntent(
                            when (position) {
                                0 -> BottomAppBarActivity::class.java
                                1 -> TopAppBarActivity::class.java
                                2 -> BackdropActivity::class.java
                                3 -> ComingSoon::class.java
                                4 -> BottomNavigationActivity::class.java
                                5 -> ButtonsActivity::class.java
                                6 -> FABActivity::class.java
                                7 -> CardActivity::class.java
                                8 -> ChipsActivity::class.java
                                9 -> ComingSoon::class.java
                                else -> null
                            }
                        )

                        if (position == 10)
                            createDialog()
                    }
                })
        )
    }

    private fun createDialog() {
        val dialogClickListener = DialogInterface.OnClickListener { _, which ->
            when (which) {
                DialogInterface.BUTTON_POSITIVE -> Snackbar.make(
                    findViewById(R.id.main_activity_cl),
                    "You pressed yes :)",
                    Snackbar.LENGTH_SHORT
                )
                    .show()

                DialogInterface.BUTTON_NEGATIVE ->
                    Snackbar.make(findViewById(R.id.main_activity_cl), "You pressed no :(", Snackbar.LENGTH_SHORT)
                        .show()
            }
        }

        val builder = AlertDialog.Builder(this, R.style.NewTheme_Dialog)
        val dialog = builder.setMessage("Are you sure?")
            .setTitle("Dialog")
            .setPositiveButton("Yes", dialogClickListener)
            .setNegativeButton("No", dialogClickListener)
            .show()

        dialog.getButton(DialogInterface.BUTTON_POSITIVE).setBackgroundColor(Color.WHITE)
        dialog.getButton(DialogInterface.BUTTON_NEGATIVE).setBackgroundColor(Color.WHITE)
        dialog.getButton(DialogInterface.BUTTON_POSITIVE).setTextColor(resources.getColor(R.color.primaryColor,theme))
        dialog.getButton(DialogInterface.BUTTON_NEGATIVE).setTextColor(resources.getColor(R.color.primaryColor,theme))
    }

    private fun createIntent(cls: Class<*>?) {
        if (cls != null) {
            val intent = Intent(this@MainActivity, cls)
            startActivity(intent)
        }
    }
}
