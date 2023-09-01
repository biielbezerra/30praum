package com.example.app30praum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.app30praum.sampledata.sampleCollectionSections
import com.example.app30praum.sampledata.sampleProductsSections
import com.example.app30praum.ui.screens.HomeScreen
import com.example.app30praum.ui.theme._30praumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App() {
    _30praumTheme {
        Surface {
            HomeScreen(
                sampleCollectionSections, sampleProductsSections
            )
        }
    }
}

