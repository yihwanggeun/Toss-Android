package com.skku.toss.presentation

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.skku.toss.R

class ListRowV2 @JvmOverloads constructor(
    context : Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : RelativeLayout(context){

    private val leftImage: ImageView
    private val centerText1: TextView
    private val centerText2: TextView
    private val rightCheckbox: Button

    init {
        val inflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.list_row_v2, this, true)

        leftImage = findViewById(R.id.left_image)
        centerText1 = findViewById(R.id.center_text1)
        centerText2 = findViewById(R.id.center_text2)
        rightCheckbox = findViewById(R.id.right_button)
    }

    fun setLeftImage(resId: Int) {
        leftImage.setImageResource(resId)
    }

    fun setCenterText1(text: String) {
        centerText1.text = text
    }

    fun setCenterText2(text: String) {
        centerText2.text = text
    }

    fun setOnClickRightButton(isChecked: Boolean) {

    }
}