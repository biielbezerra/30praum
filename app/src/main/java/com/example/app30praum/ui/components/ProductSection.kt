package com.example.app30praum.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app30praum.model.Product
import com.example.app30praum.sampledata.sampleCamisetas
import com.example.app30praum.sampledata.sampleProducts
import com.example.app30praum.ui.theme._30praumTheme

@Composable
fun ProductSection(
    title: String,
    products: List<Product>
) {
    Column {
        Row(Modifier
            .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        bottom = 10.dp,
                        end = 16.dp
                    ),
                text = title,
                fontSize = 25.sp,
                fontWeight = FontWeight(550)
            )
            Text(
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        bottom = 10.dp,
                        end = 16.dp
                    ),
                text = "Ver tudo",
                fontSize = 20.sp,
                fontWeight = FontWeight(400)
            )
        }
        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)
        ) {
            items(products) {p ->
                ProductItem(product = p)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    _30praumTheme {
        Surface {
            ProductSection("Camisetas", products = sampleProducts)
        }
    }
}