package com.example.app30praum.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app30praum.R
import com.example.app30praum.model.Product
import com.example.app30praum.sampledata.sampleProductsBermudas
import com.example.app30praum.sampledata.sampleProductsCamisetas
import com.example.app30praum.ui.components.ArtistSection
import com.example.app30praum.ui.components.ProductSection
import java.math.BigDecimal

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ArtistSection()
        ProductSection("Camisetas", sampleProductsCamisetas)
        ProductSection("Bermudas", sampleProductsBermudas)
        ProductSection(title = "Calças", products = listOf(Product(
            name = "Bermuda",
            price = BigDecimal("229.90"),
            R.drawable.calca
        )))
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}