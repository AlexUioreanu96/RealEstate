package com.example.realestate

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.TopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.realestate.ui.theme.Medium

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
            Spacer(
                modifier = Modifier
                    .width(5.dp)
                    .fillMaxHeight()
            )
            Column(modifier = Modifier.wrapContentWidth()) {
                Text(
                    modifier = Modifier.padding(top = 14.dp),
                    text = "$45,000",
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "1011KH Raamgrach",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Medium
                )
                Spacer(
                    modifier = Modifier
                        .height(25.dp)
                )
                Row() {
                    Icon(
                        modifier = Modifier.padding(end = 4.dp),
                        painter = painterResource(id = R.drawable.ic_bed),
                        contentDescription = "Bed ic"
                    )
                    Text(
                        modifier = Modifier.padding(end = 17.dp),
                        text = "1",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Medium,
                    )
                    Icon(
                        modifier = Modifier.padding(end = 4.dp),
                        painter = painterResource(id = R.drawable.ic_bath),
                        contentDescription = "Bath ic"
                    )
                    Text(
                        modifier = Modifier.padding(end = 17.dp),
                        text = "1",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Medium
                    )
                    Icon(
                        modifier = Modifier.padding(end = 4.dp),
                        painter = painterResource(id = R.drawable.ic_layers),
                        contentDescription = "Surface ic"
                    )
                    Text(
                        modifier = Modifier.padding(end = 17.dp),
                        text = "46",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Medium
                    )
                    Icon(
                        modifier = Modifier.padding(end = 4.dp),
                        painter = painterResource(id = R.drawable.ic_location),
                        contentDescription = "Location icon"
                    )
                    Text(
                        modifier = Modifier.padding(end = 17.dp),
                        text = "54.6 km",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Medium
                    )
                }
            }
            Icon(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                painter = painterResource(id = R.drawable.ic_whatshot_light),
                contentDescription = "Favorite Btn"
            )
        }
    }
}


@Composable
@Preview
fun HouseItemPreview() {
    HouseItem(item = 2)
}