package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h1menu3_data {
    fun h1menu3items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h1m3f1,
                R.drawable.hara_bhara_kabab
            ),
            listModel(
                R.string.h1m3f2,
                R.drawable.veg_crispy
            ),
            listModel(
                R.string.h1m3f3,
                R.drawable.paneer_tikka
            ),
            listModel(
                R.string.h1m3f4,
                R.drawable.chicken_lollipop
            )
        )
    }
}