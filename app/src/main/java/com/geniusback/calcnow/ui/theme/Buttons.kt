package com.geniusback.calcnow.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScreenView() {
    Card(
        modifier = Modifier
            .padding(12.dp)
            .background(color = Color.Blue)
            .size(height = 180.dp, width = 220.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
    )
    { Text(text = "ScreenView") }
}

@Composable
fun KeyView() {
    Card(
        modifier = Modifier
            .padding(12.dp, top = 320.dp)
            .background(color = Color.Green)
            .size(height = 420.dp, width = 220.dp)
            .fillMaxSize(),
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
    )
    {
        Column {
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier
                        .padding(10.dp)
                        .size(70.dp)
                        .clip(CircleShape)
                )
                {
                    Text(
                        text = "AC", fontSize = 22.sp, fontWeight = FontWeight.ExtraBold,
                        softWrap = false
                    )
                }

            }
        }
    }
}