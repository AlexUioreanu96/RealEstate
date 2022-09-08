package com.example.realestate

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Column() {
        TopAppBar(modifier = Modifier.height(80.dp)) {
            Text(text = "DTT REAL ESTATE", modifier = Modifier.padding(16.dp))
        }
        LazyColumn {
            items(10) { model ->
                HouseItem(item = model)
            }
        }
    }
}

@Composable
fun HouseItem(item: Int) {
    Card(
        Modifier
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
            .fillMaxWidth()
            .height(100.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = 2.dp,
        backgroundColor = Color.White
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Image(
                modifier = Modifier
                    .padding(14.dp)
                    .clip(MaterialTheme.shapes.small)
                    .align(Alignment.CenterVertically),
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "House image",
            )
            Spacer(modifier = Modifier
                .width(5.dp)
                .fillMaxHeight())
            Column() {
                Text(modifier = Modifier.padding(top = 14.dp), text = "$45,000", textUnit = 20.dp)
                Text(text = "dsadasdasdasdasdasdas")
                Text(text = "dsadasdasdasdasdasdas")
            }
        }
    }
}

@Composable
@Preview
fun HouseItemPreview() {
    HouseItem(item = 2)
}