package com.example.app30praum.sampledata

import com.example.app30praum.R
import com.example.app30praum.model.Product
import java.math.BigDecimal

val sampleProductsCamisetas = listOf(

    Product(
        name = "Camiseta",
        price = BigDecimal("129.90"),
        image = R.drawable.borboletue
    ),
    Product(
        name = "Camiseta",
        price = BigDecimal("129.90"),
        image = R.drawable.camisetabranca
    ),
    Product(
        name = "Camiseta",
        price = BigDecimal("229.90"),
        image = R.drawable.metralhadora
    )
)

val sampleProductsBermudas = listOf(

    Product(
        name = "Bermuda",
        price = BigDecimal("229.90"),
        R.drawable.bermuda
    ),
    Product(
        name = "Bermuda",
        price = BigDecimal("229.90"),
        image = R.drawable.berma_tue
    )
)