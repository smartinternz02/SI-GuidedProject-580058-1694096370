package com.example.food4u

import android.app.Application
import android.content.Context
import androidx.compose.runtime.Composable
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

fun getJsonDataFromAsset(context: Context, fileName: String): String? {
    val jsonString: String
    try {
        jsonString = context.assets.open(fileName).bufferedReader().use { it.readText() }
    } catch (ioException: IOException) {
        ioException.printStackTrace()
        return null
    }
    return jsonString
}

@Composable
fun ReadJSON(application: Application, file_name: String, limit: Int): List<Any> {
    val jsonString = getJsonDataFromAsset(application, file_name)

    val gson = Gson() // You can use Gson for JSON parsing

    val listType = object : TypeToken<List<Any>>() {}.type

    var items: List<Any> = gson.fromJson(jsonString, listType)

    var item_list=listOf(items).toMutableList()
    item_list.shuffle()
    return item_list.take(limit)
}



