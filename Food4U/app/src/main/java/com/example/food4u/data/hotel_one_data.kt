package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class hotel_one_data {
    fun loadHotelOneItems(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.hotel1_cat1,
                R.drawable.ind_maincourse
            ),
            listModel(
                R.string.hotel1_cat2,
                R.drawable.biryani_gen
            ),
            listModel(
                R.string.hotel1_cat3,
                R.drawable.ind_starter
            )
        )
    }
}