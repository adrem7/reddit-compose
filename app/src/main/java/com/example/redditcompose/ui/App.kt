package com.example.redditcompose.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import com.example.redditcompose.ui.theme.MyRedditTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class App {
    @Composable
    fun Render() {
        SetStatusBarColor()
        MyRedditTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize()
            )
            {
                Scaffold(
                    topBar = { TopBar() },
                    content = { paddingValues -> FeedView(paddingValues) },
                    bottomBar = { BottomBar() })
            }
        }
    }

    @Composable
    private fun SetStatusBarColor() {
        val systemUiController = rememberSystemUiController()
        val background = MaterialTheme.colors.background
        SideEffect {
            systemUiController.setStatusBarColor(background)
        }
    }
}