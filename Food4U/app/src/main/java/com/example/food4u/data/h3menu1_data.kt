package com.example.food4u.data

import com.example.food4u.R
import com.example.food4u.model.listModel

class h3menu1_data {
    fun h3menu1items(): List<listModel> {
        return listOf<listModel>(
            listModel(
                R.string.h3m1f1,
                R.drawable.kungpaohicken
            ),
            listModel(
                R.string.h3m1f2,
                R.drawable.korean_bibimbap
            ),
            listModel(
                R.string.h3m1f3,
                R.drawable.miso_butter
            ),
            listModel(
                R.string.h3m1f4,
                R.drawable.laksa
            )
        )
    }
}