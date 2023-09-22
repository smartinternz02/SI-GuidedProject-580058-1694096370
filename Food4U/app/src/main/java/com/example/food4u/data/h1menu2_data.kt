package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h1menu2_data {
    fun h1menu2items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h1m2f1,
                R.drawable.veg_biryani
            ),
            listModel(
                R.string.h1m2f2,
                R.drawable.aloo_dum_biryani
            ),
            listModel(
                R.string.h1m2f3,
                R.drawable.egg_biryani
            ),
            listModel(
                R.string.h1m2f4,
                R.drawable.chicken_biryani
            )
        )
    }
}