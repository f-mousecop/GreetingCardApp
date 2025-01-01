package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Charles!",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Hello(
                        modifier = Modifier.padding(innerPadding)
                    )
                    UpdateValues()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Scaffold(containerColor = Color.LightGray) {
        Text(
            text = "Hello, my name is $name!",
            modifier = modifier.padding(24.dp)
        )
    }
}

@Composable
fun Hello(modifier: Modifier = Modifier) {
    Text(
        text = "Hello, World!",
        modifier = modifier.padding(40.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Charles")
        Hello()
        UpdateValues()
    }
}

@Composable
fun UpdateValues(modifier: Modifier = Modifier) {
    var items = 0
    Text(
        text = "Initial items: $items",
        modifier = modifier.padding(80.dp)
    )
    for(i in items..10) {
        items += 1
        println(items)
    }

    Text(
        text = "Item: $items",
        modifier = modifier.padding(95.dp)
    )
}
