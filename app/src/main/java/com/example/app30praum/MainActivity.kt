package com.example.app30praum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
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
                Surface {
                    MyFirstComposable()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "Text 1")
        Text(text = "Text 2")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Text 3")
        Text(text = "Text 4")
    }
}

@Preview(showBackground = true)
@Composable
fun CustomLayoutPreview() {
    Column {
        Text(text = "Text 1")
        Text(text = "Text 2")
        Row {
            Text(text = "Text 3")
            Text(text = "Text 4")
        }
        Box {
            Row {
                Text(text = "Text 5")
                Text(text = "Text 6")
            }
            Column {
                Text(text = "Text 7")
                Text(text = "Text 8")
            }
        }
    }
}

@Composable
fun MyFirstComposable() {
    Text(text = "My first composable")
}

@Preview
@Composable
fun MyFirstComposablePreview() {
    _30praumTheme {
        Surface {
            MyFirstComposable()
        }
    }
}