package com.businesscar.studentapp

import android.content.Context

fun Number.dpToPx(context: Context): Float = this.toFloat() * context.resources.displayMetrics.density

fun Number.pxToDp(context: Context): Float = this.toFloat() / context.resources.displayMetrics.density