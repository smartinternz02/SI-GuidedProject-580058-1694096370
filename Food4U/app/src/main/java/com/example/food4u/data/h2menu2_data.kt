package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h2menu2_data {
    fun h2menu2items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h2m2f1,
                R.drawable.veg_fried_rice
            ),
            listModel(
                R.string.h2m2f2,
                R.drawable.schezwan_friedrice
            ),
            listModel(
                R.string.h2m2f3,
                R.drawable.egg_friedrice
            ),
            listModel(
                R.string.h2m2f4,
                R.drawable.chicken_friedrice
            )
        )
    }
}