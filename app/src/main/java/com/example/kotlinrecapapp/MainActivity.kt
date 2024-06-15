package com.example.kotlinrecapapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinrecapapp.ui.theme.KotlinRecapAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinRecapAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val value = remember {
                        mutableStateOf(0)

                    }
                    Column {
                        Text(text = value.value.toString(),modifier = Modifier.padding(10.dp))
                        Row {
                            Button(onClick = { value.value = value.value + 1 }) {

                                Text(text = "Increment")

                            }
                            Button(onClick = { value.value = value.value - 1 }) {

                                Text(text = "Decrement")

                            }

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinRecapAppTheme {
        Greeting("Android")
    }
}