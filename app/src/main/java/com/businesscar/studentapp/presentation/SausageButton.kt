package com.businesscar.studentapp.presentation

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import androidx.cardview.widget.CardView

class SausageButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : CardView(context, attrs) {

    init {
        radius = 1000f

        addView(
            TextView(context, attrs)
        )
    }
}