package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h3menu3_data {
    fun h3menu3items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h3m3f1,
                R.drawable.cheese_sandwich
            ),
            listModel(
                R.string.h3m3f2,
                R.drawable.paneer_sandwich
            ),
            listModel(
                R.string.h3m3f3,
                R.drawable.chicken_grilled_sandwich
            ),
            listModel(
                R.string.h3m3f4,
                R.drawable.paneer_barbecue_sandwich
            )
        )
    }
}