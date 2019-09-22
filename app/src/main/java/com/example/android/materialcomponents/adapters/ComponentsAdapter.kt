package com.example.android.materialcomponents.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.materialcomponents.R
import kotlinx.android.synthetic.main.component_list_item.view.*

class ComponentsAdapter(val context: Context, var isDummy: Boolean = true) :
    RecyclerView.Adapter<ComponentsAdapter.ViewHolder>() {

    private val components = if (!isDummy) {
        arrayOf(
            "App bars: bottom"
            , "App bars: top"
            , "Backdrop"
            , "Banners"
            , "Bottom navigation"
            , "Buttons"
            , "Floating Action Button"
            , "Cards"
            , "Chips"
            , "Data tables"
            , "Dialogs"
            , "Dividers"
            , "Image lists"
            , "Lists"
            , "Menus"
            , "Navigation drawer"
            , "Progress indicators"
            , "Selection controls"
            , "Sheets: bottom"
            , "Sheets: side"
            , "sliders"
            , "Snackbars"
            , "Tabs"
            , "Text fields"
            , "Tooltips"
        )
    } else {
        arrayOf(
            "Item 1"
            , "Item 2"
            , "Item 3"
            , "Item 4"
            , "Item 5"
            , "Item 6"
            , "Item 7"
            , "Item 8"
            , "Item 9"
            , "Item 10"
            , "Item 11"
            , "Item 12"
            , "Item 13"
            , "Item 14"
            , "Item 15"
            , "Item 16"
            , "Item 17"
            , "Item 18"
            , "Item 19"
            , "Item 20"
            , "Item 21"
            , "Item 22"
            , "Item 23"
            , "Item 24"
            , "Item 25"
            , "Item 26"
            , "Item 27"
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(context)
        return ViewHolder(inflater.inflate(R.layout.component_list_item, parent, false))
    }

    override fun getItemCount(): Int = components.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvComponentName.text = components[position]
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvComponentName: TextView = view.component_name_tv
    }
}