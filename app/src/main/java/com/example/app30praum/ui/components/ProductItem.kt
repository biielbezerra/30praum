package com.example.app30praum.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.app30praum.R
import com.example.app30praum.extensions.toBrazilianCurrency
import com.example.app30praum.model.Product
import com.example.app30praum.ui.theme._30praumTheme
import com.example.app30praum.ui.theme.primaryGray
import java.math.BigDecimal

@Composable
fun ProductItem(product: Product) {
    Surface(shape = RoundedCornerShape(30.dp), shadowElevation = 6.dp) {
        Box(
            modifier = Modifier
                .heightIn(min = 250.dp, max = 260.dp)
                .widthIn(min = 180.dp, max = 200.dp)
                .background(color = primaryGray)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                AsyncImage(
                    model = product.image,
                    contentDescription = null, modifier = Modifier
                        .size(180.dp)
                        .padding(2.dp)
                        .align(Alignment.CenterHorizontally),
                    contentScale = ContentScale.Fit,
                    placeholder = painterResource(id = R.drawable.placeholder)
                )
                Column(
                    modifier = Modifier
                        .padding(12.dp, 0.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally),
                        text = product.name,
                        color = Color.White,
                        fontWeight = FontWeight(700),
                        fontSize = 18.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = product.price.toBrazilianCurrency(),
                        color = Color.White,
                        fontWeight = FontWeight(400),
                        fontSize = 14.sp,
                        modifier = Modifier.padding(2.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    _30praumTheme {
        Surface {
            ProductItem(
                Product(
                    name = "Camiseta",
                    price = BigDecimal("129.90"),
                    "https://i.imgur.com/Aq07Hrs.png"
                )
            )
        }
    }
}