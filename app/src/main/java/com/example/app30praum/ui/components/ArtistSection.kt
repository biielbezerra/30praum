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
import com.example.app30praum.model.Artist

@Composable
fun ArtistSection() {
    Column {
        Text(
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    bottom = 10.dp,
                    end = 16.dp
                ),
            text = "Coleção",
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
            ArtistItem(Artist(name = "Matuê", R.drawable.matue_card))
            ArtistItem(Artist(name = "Teto", R.drawable.artist_teto))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ArtistSectionPreview() {
    ArtistSection()
}