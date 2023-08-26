package com.emlife.androidaudioplayer.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme

@Composable
fun PlayerView(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(
            text = "Player",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PlayerViewPreview() {
    AndroidAudioPlayerTheme {
        PlayerView()
    }
}