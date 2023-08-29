package com.example.app30praum.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.app30praum.R
import com.example.app30praum.model.Collection
import com.example.app30praum.ui.theme._30praumTheme
import com.example.app30praum.ui.theme.primaryGray

@Composable
fun CollectionItem(collection: Collection) {
    Surface(shape = RoundedCornerShape(30.dp), shadowElevation = 6.dp) {
        Row(
            modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(Color.White)
        ) {
            val imageSize = 110.dp
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .height(imageSize)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                primaryGray, Color.White
                            )
                        )
                    )
            ) {
                AsyncImage(
                    model = collection.image,
                    contentDescription = null, modifier = Modifier
                        .size(imageSize)
                        .align(Alignment.Center)
                        .offset(x = imageSize / 2)
                        .clip(shape = CircleShape)
                        .border(
                            BorderStroke(
                                2.dp,
                                brush = Brush.horizontalGradient(
                                    listOf(
                                        primaryGray, Color.White
                                    )
                                )
                            ), CircleShape
                        ),
                    placeholder = painterResource(id = R.drawable.placeholder)
                )
            }
            Spacer(modifier = Modifier.width(imageSize / 2))
            Box(
                Modifier
                    .padding(16.dp)
                    .fillMaxHeight()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Column{
                    Text(
                        text = collection.name,
                        color = Color.Black,
                        fontSize = 35.sp,
                        fontWeight = FontWeight(550),
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                        lineHeight = 20.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CollectionCardPreview() {
    _30praumTheme {
        Surface {
            CollectionItem(
                Collection(
                    name = "Matuê",
                    image = "https://i.imgur.com/yyyRJch.png"
                )
            )
        }
    }
}