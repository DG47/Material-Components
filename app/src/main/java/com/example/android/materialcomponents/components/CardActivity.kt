package com.example.android.materialcomponents.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.android.materialcomponents.R
import kotlinx.android.synthetic.main.activity_card.*

class CardActivity : AppCompatActivity() {

    private var cardExpanded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        card_expand_btn.setOnClickListener {
            if (!cardExpanded)
                expandCard()
            else
                collapseCard()
        }
    }

    private fun expandCard(){
        card_details_tv.visibility = View.VISIBLE
        card_expand_btn.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp)
        cardExpanded = true
    }

    private fun collapseCard(){
        card_details_tv.visibility = View.GONE
        card_expand_btn.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp)
        cardExpanded = false
    }
}
