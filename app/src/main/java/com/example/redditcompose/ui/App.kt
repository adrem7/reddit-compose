package com.example.redditcompose.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
                    content = { paddingValues ->
                        Column(
                            modifier = Modifier
                                .padding(paddingValues)
                        ) {
                            var userInput by remember { mutableStateOf("") }
                            TextField(value = "Hello World", onValueChange = { })
//                            FeedView()
                        }
                    })
            }
        }
    }

    @Composable
    private fun TopBar() {

        TopAppBar(
            title = {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
//                    Image(
//                        painter = painterResource(/*id = R.drawable.instalogic*/),
//                        contentDescription = "Instalogic",
//                        modifier = Modifier
//                            .width(100.dp)
//                            .padding(top = 10.dp)
//                    )
                }
            },
            backgroundColor = Color.White,
            modifier = Modifier.height(40.dp),
            elevation = 0.dp
        )
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