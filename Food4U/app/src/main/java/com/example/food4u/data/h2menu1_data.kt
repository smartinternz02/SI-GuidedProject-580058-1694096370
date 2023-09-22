package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h2menu1_data {
    fun h2menu1items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h2m1f1,
                R.drawable.veg_noodles
            ),
            listModel(
                R.string.h2m1f2,
                R.drawable.hakka_noodles
            ),
            listModel(
                R.string.h2m1f3,
                R.drawable.schezwan_noodles
            ),
            listModel(
                R.string.h2m1f4,
                R.drawable.chicken_noodles
            )
        )
    }
}