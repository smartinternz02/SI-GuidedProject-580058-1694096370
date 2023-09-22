package com.example.food4u.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class listModel(
    @StringRes var name: Int,
    @DrawableRes var img: Int
)
