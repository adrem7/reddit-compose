package com.example.redditcompose.ui

import androidx.compose.material.BottomAppBar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomBar() {
    BottomAppBar(
        content = {
            Text("This is the bottom nav bar")
//            var tabIndex by remember { mutableStateOf(0) }
//            val tabData = listOf(
//                ,
//            )
//            TabRow(selectedTabIndex = tabIndex) {
//                tabData.forEachIndexed { index, icon ->
//                    Tab(selected = tabIndex == index, onClick = {
//                        tabIndex = index
//                    }, icon = {
//                        Icon(imageVector = icon, contentDescription = null)
//                    })
//                }
//            }
        }
    )
}