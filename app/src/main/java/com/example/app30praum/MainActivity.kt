package com.example.app30praum

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
import com.example.app30praum.ui.theme._30praumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30praumTheme {
                Surface{
                    MyFirstComposable()
                }
            }
        }
    }
}

@Composable
fun MyFirstComposable(){
    Text(text = "My first composable")
}

@Preview()
@Composable
fun MyFirstComposablePreview(){
    _30praumTheme {
        Surface {
            MyFirstComposable()
        }
    }
}