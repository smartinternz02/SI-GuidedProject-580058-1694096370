package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h2menu3_data {
    fun h2menu3items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h2m3f1,
                R.drawable.veg_manchurian
            ),
            listModel(
                R.string.h2m3f2,
                R.drawable.gobi_manchurian
            ),
            listModel(
                R.string.h2m3f3,
                R.drawable.paneer_manchurian
            ),
            listModel(
                R.string.h2m3f4,
                R.drawable.chicken_manchurian
            )
        )
    }
}