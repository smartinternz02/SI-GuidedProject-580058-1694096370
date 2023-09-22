package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h3menu2_data {
    fun h3menu2items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h3m2f1,
                R.drawable.hamburger
            ),
            listModel(
                R.string.h3m2f2,
                R.drawable.buffalo_wings
            ),
            listModel(
                R.string.h3m2f3,
                R.drawable.barbecue_ribs
            ),
            listModel(
                R.string.h3m2f4,
                R.drawable.roasted_chicken
            )
        )
    }
}