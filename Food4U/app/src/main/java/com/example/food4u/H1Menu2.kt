package com.example.food4u

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import com.example.food4u.data.h1menu2_data
import com.example.food4u.model.listModel

class H1Menu2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            H1Menu2Page()
        }
    }
}

@Composable
fun H1Menu2Card(
    h1menu2: listModel,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = h1menu2.img),
                contentDescription = stringResource(id = h1menu2.name),
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(194.dp).fillMaxSize()
            )

            Text(
                text = stringResource(id = h1menu2.name),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun H1Menu2List(h1menu2list: List<listModel>, modifier: Modifier = Modifier) {
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
                    text = "Biryani",
                    fontSize = 30.sp
                )
            }
        }
        items(h1menu2list) {food ->
            H1Menu2Card(
                h1menu2 = food,
                modifier = Modifier.padding(8.dp),
            )
        }
    }
}

@Composable
fun H1Menu2Page() {
    H1Menu2List(
        h1menu2list = h1menu2_data().h1menu2items()
    )
}