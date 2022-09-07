package com.example.realestate

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
            .padding(8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {

    }
}

@Composable
@Preview
fun HouseItemPreview() {
    HouseItem(item = 2)
}