package com.emlife.androidaudioplayer.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme

@Composable
fun SignInView() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Navbar()
        Spacer(modifier = Modifier.height(80.dp))
        Username()
        Password()
        ResetPasswordButton()
        SubmitButton()
    }
}

@Composable
fun Navbar() {
    Box(
        Modifier
            .padding(24.dp)
            .background(Color(0xFF1F1F1F))
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
            .height(40.dp)
    )
}

@Composable
fun InputField() {
    Box(
        Modifier
            .background(Color(0xFF1F1F1F))
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
            .height(80.dp)
    )
}

@Composable
fun Username() {
    InputField()
}

@Composable
fun Password() {
    InputField()
}

@Composable
fun ResetPasswordButton() {
    Box(
        Modifier
            .background(Color(0xFF1F1F1F))
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
            .height(80.dp)
    )
}

@Composable
fun SubmitButton() {
    Box(
        Modifier
            .background(Color(0xFF75FA9E))
            .border(width = 1.dp, color = Color.Black)
            .fillMaxWidth()
            .height(80.dp)
    ) {
        Text(
            text = "Sign In",
            color = Color.Black,
            fontWeight = FontWeight.Medium,
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SignInViewPreview() {
    AndroidAudioPlayerTheme {
        SignInView()
    }
}