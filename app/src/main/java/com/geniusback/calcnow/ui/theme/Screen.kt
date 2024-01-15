package com.geniusback.calcnow.ui.theme

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ScreenView( result:String) {
    Card(
        modifier = Modifier
            .padding(12.dp)
            .size(height = 180.dp, width = 220.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
    )
    { Text(text = result) }
}
