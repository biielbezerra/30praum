package com.example.app30praum.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app30praum.model.Collection
import com.example.app30praum.model.Product
import com.example.app30praum.sampledata.sampleCollectionSections
import com.example.app30praum.sampledata.sampleProductsSections
import com.example.app30praum.ui.components.CollectionSection
import com.example.app30praum.ui.components.ProductSection
import com.example.app30praum.ui.theme._30praumTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(collectionSection: Map<String, List<Collection>>, productSection: Map<String, List<Product>>) {
    Column{
        OutlinedTextField(shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            value = "O que você procura?",
            onValueChange = { newValue -> }
            )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            for (section in collectionSection) {
                val title = section.key
                val collection = section.value
                item(collection) {
                    CollectionSection(title = title, collection = collection)
                }
            }
            for (section in productSection) {
                val title = section.key
                val products = section.value
                item(products) {
                    ProductSection(title = title, products = products)
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    _30praumTheme {
        Surface {
            HomeScreen(sampleCollectionSections, sampleProductsSections)
        }
    }
}