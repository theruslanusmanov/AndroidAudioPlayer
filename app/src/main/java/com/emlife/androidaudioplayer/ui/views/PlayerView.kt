package com.emlife.androidaudioplayer.ui.views

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emlife.androidaudioplayer.R
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
        var isPlaying by remember { mutableStateOf(false) }
        val context = LocalContext.current
        val mediaPlayer by remember { mutableStateOf(MediaPlayer.create(context, R.raw.audio)) }

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
                .clickable {
                    isPlaying = !isPlaying
                    if (isPlaying) mediaPlayer.start() else mediaPlayer.pause()
                }
        ) {
            Image(
                painter = painterResource(id = if (isPlaying) R.drawable.ic_pause else R.drawable.ic_play),
                contentDescription = "Play",
                alignment = Alignment.Center,
                modifier = Modifier.fillMaxSize(),
            )
        }
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