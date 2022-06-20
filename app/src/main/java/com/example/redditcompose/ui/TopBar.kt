package com.example.redditcompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.redditcompose.R
import com.example.redditcompose.ui.theme.RedditBlack80

@Composable
fun TopBar(
) {
    Column(
        modifier = Modifier
            .wrapContentHeight()
            .background(color = RedditBlack80),
    ) {
        TopAppBar(
            content = {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_menu),
                        contentDescription = "Hamburger Menu",
                        modifier = Modifier.padding(8.dp),
                    )
                    var searchInput by remember { mutableStateOf("Search") }
                    TextField(
                        value = searchInput,
                        onValueChange = { searchInput = it },
                        modifier = Modifier.fillMaxHeight()
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_profile),
                        contentDescription = "Profile Image",
                        modifier = Modifier.padding(8.dp),
                    )
                }


            }
        )

        var tabIndex by remember { mutableStateOf(0) }
        val tabData = listOf(
            "Home",
            "Popular",
        )
        TabRow(
            selectedTabIndex = tabIndex,
            modifier = Modifier
                .padding(32.dp, 8.dp)
                .height(24.dp)
        ) {
            tabData.forEachIndexed { index, text ->
                Tab(selected = tabIndex == index, onClick = {
                    tabIndex = index
                }, text = {
                    Text(text = text)
                })
            }
        }
    }
}