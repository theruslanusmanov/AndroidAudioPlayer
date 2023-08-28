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
import androidx.compose.foundation.layout.padding
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
import com.emlife.androidaudioplayer.ui.components.SearchInput
import com.emlife.androidaudioplayer.ui.components.TrackList
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme

@Composable
fun DiscoverView(onTrack: () -> Unit, onBack: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Navbar(title = "Discover", onBack)
        Spacer(modifier = Modifier.height(24.dp))
        SearchInput()
        Column(modifier = Modifier.padding(24.dp)) {
            Title("Genre shortcuts")
            Spacer(modifier = Modifier.height(24.dp))
            Genres()
            Spacer(modifier = Modifier.height(24.dp))
            Title("Top 10 tracks")
            Spacer(modifier = Modifier.height(24.dp))
            TrackList(onTrack)
        }
    }
}

@Composable
fun Title(value: String = "Title") {
    Text(
        text = value,
        fontSize = 24.sp,
        color = Color.White,
        style = TextStyle(textAlign = TextAlign.Start),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun Genre() {
    Box(
        Modifier
            .background(Color(0xFF8E56F2))
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
            .height(64.dp)
    )
}

@Composable
fun Genres() {
    Row {
        Genre()
    }
}

@Preview()
@Composable
fun DiscoverViewPreview() {
    AndroidAudioPlayerTheme {
        DiscoverView({}, {})
    }
}