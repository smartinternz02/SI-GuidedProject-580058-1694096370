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
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.food4u.data.h3menu1_data
import com.example.food4u.data.h3menu2_data
import com.example.food4u.model.listModel
import com.example.food4u.ui.theme.Food4UTheme

class H3Menu2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            H3Menu2Page()
        }
    }
}

@Composable
fun H3Menu2Card(
    h3menu2: listModel,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier) {
        Column {
            Image(
                painter = painterResource(id = h3menu2.img),
                contentDescription = stringResource(id = h3menu2.name),
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(194.dp).fillMaxSize()
            )

            Text(
                text = stringResource(id = h3menu2.name),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.headlineSmall
            )
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun H3Menu2List(h3menu2list: List<listModel>, modifier: Modifier = Modifier) {
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
                    text = "Western",
                    fontSize = 30.sp
                )
            }
        }
        items(h3menu2list) {food ->
            H3Menu2Card(
                h3menu2 = food,
                modifier = Modifier.padding(8.dp),
            )
        }
    }
}

@Composable
fun H3Menu2Page() {
    H3Menu2List(
        h3menu2list = h3menu2_data().h3menu2items()
    )
}