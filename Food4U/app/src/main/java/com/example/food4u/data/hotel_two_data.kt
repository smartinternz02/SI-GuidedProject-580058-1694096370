package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class hotel_two_data {
    fun loadHotelTwoItems(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.hotel2_cat1,
                R.drawable.noodles_gen
            ),
            listModel(
                R.string.hotel2_cat2,
                R.drawable.friedrice_gen
            ),
            listModel(
                R.string.hotel2_cat3,
                R.drawable.manchurian_gen
            )
        )
    }
}