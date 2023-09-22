package com.example.food4u

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food4u.data.hotel_three_data
import com.example.food4u.data.hotel_two_data
import com.example.food4u.model.listModel

class Hotel3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HotelThreePage()
        }
    }
}

@Composable
fun HotelThreeCard(
    hotel: listModel,
    modifier: Modifier = Modifier,
    category_number: Int
) {
    val mContext = LocalContext.current
    Card(
        modifier = modifier
            .clickable
            {
                when (category_number) {
                    0 -> mContext.startActivity(Intent(mContext, H3Menu1::class.java))
                    1 -> mContext.startActivity(Intent(mContext, H3Menu2::class.java))
                    2 -> mContext.startActivity(Intent(mContext, H3Menu3::class.java))
                }
            }
    ) {
        Column {
            Image(
                painter = painterResource(id = hotel.img),
                contentDescription = stringResource(id = hotel.name),
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(194.dp).fillMaxSize()
            )

            Text(
                text = stringResource(id = hotel.name),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HotelThreeList(hotel_three_list: List<listModel>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        stickyHeader {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF528deb))
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Continental Restaurant Menu",
                    fontSize = 30.sp
                )
            }
        }
        itemsIndexed(hotel_three_list) { index, hotel ->
            HotelThreeCard(
                hotel = hotel,
                modifier = Modifier.padding(8.dp),
                category_number = index
            )
        }
    }
}

@Composable
fun HotelThreePage() {
    HotelThreeList(
        hotel_three_list = hotel_three_data().loadHotelThreeItems()
    )
}