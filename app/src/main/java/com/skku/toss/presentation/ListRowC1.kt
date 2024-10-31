package com.skku.toss.presentation

import android.content.Context
import android.view.LayoutInflater
import android.widget.RelativeLayout
import android.widget.TextView
import com.skku.toss.R

class ListRowC1 @JvmOverloads constructor(
    context : Context
): RelativeLayout(context){
    private val centerText : TextView

    init{
        val Inflater = LayoutInflater.from(context)
        Inflater.inflate(R.layout.list_row_c1,this,true)
        centerText = findViewById(R.id.center_text)
    }

    fun setCenterText(text : String){
        centerText.setText(text)
    }
}