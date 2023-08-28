package com.example.app30praum.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app30praum.R
import com.example.app30praum.model.Product
import com.example.app30praum.sampledata.sampleProductsCamisetas
import java.math.BigDecimal

@Composable
fun ProductSection(
    title: String,
    products: List<Product>
) {
    Column {
        Text(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    bottom = 10.dp,
                    end = 16.dp
                ),
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            for (p in products){
                ProductItem(product = p)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    ProductSection("Camisetas", products = sampleProductsCamisetas)
}