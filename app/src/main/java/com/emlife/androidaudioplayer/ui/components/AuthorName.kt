package com.emlife.androidaudioplayer.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun AuthorName(name: String) {
    Text(
        text = name,
        fontSize = 20.sp,
        color = Color.Gray,
        style = TextStyle(textAlign = TextAlign.Center),
        modifier = Modifier.fillMaxWidth()
    )
}