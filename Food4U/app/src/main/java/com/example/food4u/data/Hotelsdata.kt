package com.example.food4u.data

import android.app.Application
import android.util.Log
import androidx.compose.runtime.Composable
import com.example.food4u.R
import com.example.food4u.ReadJSON
import com.example.food4u.model.listModel
import kotlin.reflect.typeOf

class Hotelsdata() {
    @Composable
    fun loadHotels(): List<listModel> {
        // define read_json globally - :param limit, :param file_name
        // using read_json return listModel with random n items
        return listOf<listModel>(
            listModel(
                R.string.hotel1,
                R.drawable.indianrestaurant
            ),
            listModel(
                R.string.hotel2,
                R.drawable.chineserestaurant
            ),
            listModel(
                R.string.hotel3,
                R.drawable.continentalrestaurant
            )
        )

    }
}