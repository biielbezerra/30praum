package com.example.app30praum

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.sp
import com.example.app30praum.model.Product
import com.example.app30praum.ui.theme.Purple40
import com.example.app30praum.ui.theme.Purple80
import com.example.app30praum.ui.theme._30praumTheme
import com.example.app30praum.ui.theme.primaryGray
import kotlinx.coroutines.coroutineScope
import java.math.BigDecimal
import kotlin.math.max

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30praumTheme {
                Surface {
                    ProductSection()
                }
            }
        }
    }
}

@Composable
fun ProductSection() {
    Column {
        Text(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp
                ),
            text = "Camisetas",
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            modifier = Modifier
                .padding(
                    top = 16.dp,
                    bottom = 16.dp
                )
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp)
            , horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProductItem(Product(
                name = "Camiseta",
                price = BigDecimal("129.90"),
                image = R.drawable.ieu_2580_1536x2048_png
            ))
            ProductItem(Product(
                name = "Camiseta",
                price = BigDecimal("129.90"),
                image = R.drawable.metralhadora_preta_frente_1000x1000_png
            ))
            ProductItem(Product(
                name = "Bermuda",
                price = BigDecimal("229.90"),
                image = R.drawable.bermuda_verde_frente_1000x1000_png
            ))
        }
    }
}

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
                Image(
                    painter = painterResource(id = product.image),
                    contentDescription = null, modifier = Modifier
                        .size(180.dp)
                        .padding(2.dp)
                        .align(CenterHorizontally)
                )
                Column(
                    modifier = Modifier
                        .padding(12.dp, 0.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .align(CenterHorizontally),
                        text = product.name,
                        color = Color.White,
                        fontWeight = FontWeight(700),
                        fontSize = 18.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = product.price.toPlainString(),
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

@Composable
fun ArtistCard() {
    Surface(Modifier.padding(20.dp), shape = RoundedCornerShape(30.dp), shadowElevation = 6.dp) {
        Row(
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth()
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .height(imageSize)
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Purple80, Purple40
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null, modifier = Modifier
                        .size(imageSize)
                        .align(Alignment.Center)
                        .offset(x = imageSize / 2)
                        .clip(shape = CircleShape)
                        .border(
                            BorderStroke(
                                2.dp,
                                brush = Brush.verticalGradient(
                                    listOf(
                                        Purple80,
                                        Purple40
                                    )
                                )
                            ), CircleShape
                        )
                )
            }
            Spacer(modifier = Modifier.width(imageSize / 2))
            Box(
                Modifier
                    .padding(16.dp)
                    .fillMaxHeight()
                    .padding(16.dp)
                    .align(CenterVertically),
            ) {
                Column {
                    Text(
                        text = LoremIpsum(50).values.first(),
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
private fun ProductSectionPreview() {
    ProductSection()
}

@Preview(showBackground = true)
@Composable
private fun ProductItemPreview() {
    ProductItem(
        Product(
        name = "Camiseta",
        price = BigDecimal("129.90"),
        R.drawable.ic_launcher_background
    ))
}