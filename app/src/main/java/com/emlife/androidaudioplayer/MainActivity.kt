package com.emlife.androidaudioplayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.emlife.androidaudioplayer.ui.theme.AndroidAudioPlayerTheme
import com.emlife.androidaudioplayer.ui.views.DiscoverView
import com.emlife.androidaudioplayer.ui.views.PlayerView
import com.emlife.androidaudioplayer.ui.views.PlaylistView
import com.emlife.androidaudioplayer.ui.views.SignInView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAudioPlayerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "signIn") {
                        composable("signIn") { SignInView(onSubmit = {navController.navigate("discover")}, onBack = {/** TODO */}) }
                        composable("discover") { DiscoverView(onTrack = {navController.navigate("player")}, onBack = {navController.popBackStack()}) }
                        composable("playlist") { PlaylistView(onTrack = {navController.navigate("player")}, onBack = {navController.popBackStack()}) }
                        composable("player") { PlayerView(onBack = {navController.popBackStack()}) }
                    }
                }
            }
        }
    }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidAudioPlayerTheme {
        SignInView({}, {})
    }
}