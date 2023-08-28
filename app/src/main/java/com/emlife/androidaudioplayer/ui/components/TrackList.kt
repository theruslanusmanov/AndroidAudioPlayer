package com.emlife.androidaudioplayer.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

@Composable
fun TrackList(onTrack: () -> Unit) {
    Column {
        Track(onTrack)
        Track(onTrack)
        Track(onTrack)
        Track(onTrack)
        Track(onTrack)
    }
}