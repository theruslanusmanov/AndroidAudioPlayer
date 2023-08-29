package com.emlife.androidaudioplayer.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.emlife.androidaudioplayer.R

@Composable
fun Cover() {
    Box(
        Modifier
            .background(Color.Gray)
            .border(width = 1.dp, color = Color.Black)
            .width(250.dp)
            .height(250.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.cover),
            contentDescription = "Cover",
            alignment = Alignment.Center,
            modifier = Modifier.fillMaxSize(),
        )
    }
}