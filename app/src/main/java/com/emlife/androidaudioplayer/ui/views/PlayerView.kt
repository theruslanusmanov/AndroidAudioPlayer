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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emlife.androidaudioplayer.ui.components.AuthorName
import com.emlife.androidaudioplayer.ui.components.Cover
import com.emlife.androidaudioplayer.ui.components.Navbar
import com.emlife.androidaudioplayer.ui.components.TrackName
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme

@Composable
fun PlayerView(onBack: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Navbar("Player", onBack)
        Spacer(modifier = Modifier.height(24.dp))
        Cover()
        TrackName(name = "Song 2023")
        AuthorName(name = "Charlotte")
        Spacer(modifier = Modifier.weight(1f))
        ProgressBar()
        Spacer(modifier = Modifier.weight(1f))
        PlayerControls()
    }
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
fun PlayerControls() {
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
        PlayerView({})
    }
}