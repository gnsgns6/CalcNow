package com.geniusback.calcnow

import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.geniusback.calcnow.ui.theme.CalcNowTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContent {
            CalcNowTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(state = rememberScrollState())
                ) {
                    ScreenView()
                    KeyView()
                    val a = Calc("LEGACY")
//                    CalcView(a.calcName("GNEISS"))
                }

            }

        }
    }
}


@Composable
fun CalcView(name2: String) {
    Text(
        text = "Hello $name2"
    )
}

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
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "<<", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "%", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "/", fontSize = 30.sp) }
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "7", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "8", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "9", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "9", fontSize = 30.sp) }
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "7", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "8", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "9", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "9", fontSize = 30.sp) }
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "7", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "8", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "9", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "9", fontSize = 30.sp) }
            }
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "7", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "8", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "9", fontSize = 30.sp) }
                Button(
                    onClick = { /*TODO*/ }, modifier = Modifier
                        .padding(12.dp), shape = RoundedCornerShape(10.dp)
                )
                { Text(text = "9", fontSize = 30.sp) }
            }
        }
    }
}
//@Preview(showSystemUi = true, showBackground = true)
//@Composable
//fun GreetingPreview() {
//    CalcNowTheme {
//        CalcView("Android")
//    }
//}
//@Composable
//fun ScreenViewPreview() {
//    CalcNowTheme {
//        ScreenView()
//    }
//}
//@Composable
//fun KeyViewPreview(){
//    CalcNowTheme {
//        KeyView()
//    }
//}