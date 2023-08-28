package com.emlife.androidaudioplayer.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emlife.androidaudioplayer.ui.components.Navbar
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme

@Composable
fun PlayerView() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Navbar("Player")
        Cover()
        TrackName(name = "Song 2023")
        AuthorName(name = "Charlotte")
        Spacer(modifier = Modifier.weight(1f))
        ProgressBar()
        Spacer(modifier = Modifier.weight(1f))
        Controls()
    }
}

@Composable
fun Cover() {
    Box(
        Modifier
            .background(Color.Gray)
            .border(width = 1.dp, color = Color.Black)
            .width(250.dp)
            .height(250.dp)
    )
}

@Composable
fun TrackName(name: String) {
    Text(
        text = name,
        fontSize = 32.sp,
        color = Color.White,
        style = TextStyle(textAlign = TextAlign.Center),
        modifier = Modifier.fillMaxWidth()
    )
}

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

@Composable
fun ProgressBar() {
    Box(
        Modifier
            .background(Color(0xFF75FA9E))
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
            .height(48.dp)
    )
}

@Composable
fun Controls() {
    val height = 80.dp
    Row(modifier = Modifier.fillMaxWidth()) {
        Box(
            Modifier
                .background(Color.Gray)
                .border(width = 1.dp, color = Color.Black)
                .height(height)
                .weight(1f)
        )
        Box(
            Modifier
                .background(Color.Gray)
                .border(width = 1.dp, color = Color.Black)
                .height(height)
                .weight(1f)
        )
        Box(
            Modifier
                .background(Color(0xFF75FA9E))
                .border(width = 1.dp, color = Color.Black)
                .height(height)
                .weight(1f)
        )
        Box(
            Modifier
                .background(Color.Gray)
                .border(width = 1.dp, color = Color.Black)
                .height(height)
                .weight(1f)
        )
        Box(
            Modifier
                .background(Color.Gray)
                .border(width = 1.dp, color = Color.Black)
                .height(height)
                .weight(1f)
        )
    }
}

@Preview()
@Composable
fun PlayerViewPreview() {
    AndroidAudioPlayerTheme {
        PlayerView()
    }
}