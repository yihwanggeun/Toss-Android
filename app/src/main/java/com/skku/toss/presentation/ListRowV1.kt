package com.skku.toss.presentation

import android.content.Context
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.skku.toss.R

class ListRowV1 @JvmOverloads constructor(
    context : Context
) : RelativeLayout(context){
    private val leftImage : ImageView
    private val centerText : TextView
    private val rightButton : Button

    init {
        val Inflater = LayoutInflater.from(context)
        Inflater.inflate(R.layout.list_row_v1, this, true)

        leftImage = findViewById(R.id.left_image)
        centerText = findViewById(R.id.center_text)
        rightButton = findViewById(R.id.right_button)
    }

    fun setLeftImage(resId: Int) {
        leftImage.setImageResource(resId)
    }

    fun setVisibleTrue(){
        leftImage.visibility = VISIBLE
    }

    fun setVisibleFalse(){
        leftImage.visibility = GONE
    }
    fun setCenterText1(text: String) {
        centerText.text = text
    }

    fun setOnClickRightButton(isChecked: Boolean) {

    }
}