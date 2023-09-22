package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class hotel_three_data {
    fun loadHotelThreeItems(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.hotel3_cat1,
                R.drawable.asian_gen
            ),
            listModel(
                R.string.hotel3_cat2,
                R.drawable.western_gen
            ),
            listModel(
                R.string.hotel3_cat3,
                R.drawable.sandwich_gen
            )
        )
    }
}