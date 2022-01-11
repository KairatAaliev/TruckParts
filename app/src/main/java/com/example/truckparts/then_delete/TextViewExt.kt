package com.example.truckparts.then_delete

import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat

fun TextView.setTextColorResource(@ColorRes res : Int) {
    setTextColor(ContextCompat.getColor(context, res))
}