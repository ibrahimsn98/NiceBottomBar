package me.ibrahimsn.lib

import android.graphics.RectF
import android.graphics.drawable.Drawable

data class BottomBarItem(var title: String, val icon: Drawable, val activeIcon: Drawable?,
                         var rect: RectF = RectF(), var badgeSize: Float = 0f)