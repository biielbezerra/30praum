package com.example.app30praum.sampledata

import com.example.app30praum.model.Collection
import com.example.app30praum.model.Product
import java.math.BigDecimal

val sampleCollections: List<Collection> = listOf(
    Collection(name = "Matuê", "https://i.imgur.com/yyyRJch.png"),
    Collection(name = "Wiu", "https://i.imgur.com/ZtOGRsG.png"),
    Collection(name = "Teto", "https://i.imgur.com/rGqOYzO.png")
)

val sampleCollectionSections = mapOf(
    "Coleção" to sampleCollections,
)

val sampleCamisetas = listOf(

    Product(
        name = "Camiseta",
        price = BigDecimal("129.90"),
        image = "https://i.imgur.com/Aq07Hrs.png"
    ),
    Product(
        name = "Camiseta",
        price = BigDecimal("129.90"),
        image = "https://i.imgur.com/O7iQK6Q.png"
    ),
    Product(
        name = "Camiseta",
        price = BigDecimal("229.90"),
        image = "https://i.imgur.com/nR9E3W1.png"
    )
)

val sampleBermudas = listOf(

    Product(
        name = "Bermuda",
        price = BigDecimal("229.90"),
        image = "https://i.imgur.com/isgEf7S.png"
    ),
    Product(
        name = "Bermuda",
        price = BigDecimal("229.90"),
        image = "https://i.imgur.com/iHhSJek.png"
    )
)

val sampleCalcas = listOf(
    (Product(
        name = "Calça",
        price = BigDecimal("229.90"),
        image = "https://i.imgur.com/lM7JnpE.png"
    ))
)

val sampleProducts = listOf(
    Product(
        name = "Moletom Testando Duas linhas",
        price = BigDecimal("299.99"),
        image = "https://i.imgur.com/Eh7aXYz.png"
    ),
    Product(
        name = "Boné",
        price = BigDecimal("129.90"),
        image = "https://i.imgur.com/D3WSYsu.png"
    ),
    *sampleCamisetas.toTypedArray(),
    *sampleBermudas.toTypedArray(),
    *sampleCalcas.toTypedArray()
)

val sampleProductsSections = mapOf(
    "Produtos" to sampleProducts,
    "Camisetas" to sampleCamisetas,
    "Bermudas" to sampleBermudas,
    "Calças" to sampleCalcas
)