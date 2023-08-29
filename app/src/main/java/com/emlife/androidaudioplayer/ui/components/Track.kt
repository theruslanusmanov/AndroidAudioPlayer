package com.emlife.androidaudioplayer.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emlife.androidaudioplayer.R
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme

@Composable
fun Track(onClick: () -> Unit) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(Color(0xFF1F1F1F))
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
            .height(80.dp)
            .clickable { onClick() }
    ) {
        // number
        Text(text = "1")

        // cover
        Image(
            painter = painterResource(id = R.drawable.cover),
            contentDescription = "Cover",
            alignment = Alignment.Center,
        )

        // descr
        Column(modifier = Modifier.weight(1f)) {
            // title
            Text(text = "Title Audio")

            // author
            Text(text = "Title Author", style = TextStyle(color = Color.Gray))
        }

        // actions button
        Image(
            painter = painterResource(id = R.drawable.ic_more_horiz),
            contentDescription = "Actions",
            alignment = Alignment.Center,
        )
    }
}

@Preview()
@Composable
fun TrackPreview() {
    AndroidAudioPlayerTheme {
        Track({})
    }
}