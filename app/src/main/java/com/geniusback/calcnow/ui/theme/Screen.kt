package com.geniusback.calcnow.ui.theme
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

    @Composable
    fun NumberClick(number: String){
        var displayNumber by remember { mutableStateOf("") }
        displayNumber = number
    }


    @Composable
    fun ScreenView(number: String) {
        Card(
            modifier = Modifier
                .padding(12.dp)
                .size(height = 180.dp, width = 220.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 12.dp)
        )
        {
            Row(
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(end = 20.dp, top = 100.dp)
            )

            {
                Text(
                    text = number,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.Cursive,
                    fontSize = 55.sp
                )
            }
        }
    }

