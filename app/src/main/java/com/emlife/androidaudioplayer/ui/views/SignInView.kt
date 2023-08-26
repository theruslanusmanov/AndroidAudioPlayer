package com.emlife.androidaudioplayer.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme

@Composable
fun SignInView(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Text(
            text = "SignIn",
            modifier = modifier
        )
        Username()
        Password()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Username() {
    TextField(
        value = "Username",
        onValueChange = {},
        modifier = Modifier.background(Color(0xFF1F1F1F))
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Password() {
    TextField(
        value = "Username",
        onValueChange = {},
        modifier = Modifier.background(Color(0xFF1F1F1F))
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidAudioPlayerTheme {
        SignInView()
    }
}