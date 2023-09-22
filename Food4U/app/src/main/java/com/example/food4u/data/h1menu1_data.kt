package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h1menu1_data {
    fun h1menu1items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h1m1f1,
                R.drawable.veg_handi
            ),
            listModel(
                R.string.h1m1f2,
                R.drawable.veg_kadai
            ),
            listModel(
                R.string.h1m1f3,
                R.drawable.paneer_tikka_masala
            ),
            listModel(
                R.string.h1m1f4,
                R.drawable.paneer_kadai
            )
        )
    }
}