package com.geniusback.calcnow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.geniusback.calcnow.ui.theme.CalcNowTheme

class MainActivity : ComponentActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {

        super.onCreate(savedInstanceState)
        setContent {
            CalcNowTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val a = Calc("GNS");
                    CalcView(a.calcName("GNEISS"))
                }

            }

        }
    }
}


@Composable
fun CalcView(name2:String){
    Text(
        text="Hello $name2"
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CalcNowTheme {
        CalcView("Android")
    }
}