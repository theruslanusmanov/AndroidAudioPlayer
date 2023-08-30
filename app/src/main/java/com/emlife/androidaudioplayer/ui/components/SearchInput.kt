package com.emlife.androidaudioplayer.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchInput() {
    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Search") },
        leadingIcon = { Icon(Icons.Filled.Search, contentDescription = null) },
        modifier = Modifier.background(Color(0xFF1F1F1F))
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
    )
}

@Preview()
@Composable
fun SearchInputPreview() {
    AndroidAudioPlayerTheme {
        SearchInput()
    }
}