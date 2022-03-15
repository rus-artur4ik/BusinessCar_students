package com.businesscar.studentapp.presentation.registration

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatRadioButton

class ShadowingRadioButton @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : AppCompatRadioButton(context, attrs) {

    val onChecked = { isChecked: Boolean ->
        setShadowLayer(
            if (isChecked) 5f else 0f,
            shadowDx,
            shadowDy,
            shadowColor
        )
    }

    init {
        setOnCheckedChangeListener(null)
    }

    override fun setOnCheckedChangeListener(listener: OnCheckedChangeListener?) {
        super.setOnCheckedChangeListener { btn, isChecked ->
            onChecked(isChecked)
            listener?.onCheckedChanged(btn, isChecked)
        }
    }
}