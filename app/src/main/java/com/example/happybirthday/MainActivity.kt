package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column // {{ edit_1 }}
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.ui.graphics.Color // Asegúrate de que esta importación esté presente

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF9C27B0) // {{ edit_1 }} - Color lila
                ) {
                    GreetingText(message = "Happy Birthday Sam!", from = "From Emma") // {{ edit_1 }}
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable

fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingText(message = "Happy Birthday Sam!", from = "From Diana") // {{ edit_1 }}
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) { // {{ edit_2 }}
    Column(
        verticalArrangement = Arrangement.Center, // {{ edit_1 }}
        modifier = modifier.padding(8.dp) // {{ edit_1 }}
    ) { // {{ edit_3 }}
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center // {{ edit_1 }}
        )
        Text(
            text = from, // {{ edit_4 }}
            fontSize = 36.sp // {{ edit_5 }}
        )
    }
}
