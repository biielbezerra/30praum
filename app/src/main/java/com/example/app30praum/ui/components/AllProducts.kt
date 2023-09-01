package com.example.app30praum.ui.components
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app30praum.model.Product
import com.example.app30praum.sampledata.sampleProducts
import com.example.app30praum.ui.theme._30praumTheme

@Composable
fun AllProducts(allProducts: List<Product>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {

        item(span = {
            GridItemSpan(maxLineSpan)
        }) {
            Text(
                text = "Todos os Produtos",
                fontSize = 25.sp,
                fontWeight = FontWeight(550)
            )
        }
        items(allProducts) { p ->
            ProductItem(product = p)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun AllProductsPreview() {
    _30praumTheme {
        Surface {
            AllProducts(sampleProducts)
        }
    }
}