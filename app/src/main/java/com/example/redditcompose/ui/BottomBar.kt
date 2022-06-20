package com.example.redditcompose.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar() {
    BottomAppBar(
        content = {
            var tabIndex by remember { mutableStateOf(0) }
            val tabData = listOf(
                Icons.Filled.Home,
                Icons.Filled.CheckCircle,
                Icons.Filled.Add,
                Icons.Filled.MailOutline,
                Icons.Filled.Notifications,
            )
            TabRow(
                selectedTabIndex = tabIndex,
                indicator = {
                    Box(modifier = Modifier.height(0.dp))
                }
            ) {
                tabData.forEachIndexed { index, icon ->
                    Tab(
                        selected = tabIndex == index,
                        onClick = {
                            tabIndex = index
                        },
                        icon = {
                            Icon(imageVector = icon, contentDescription = null)
                        }
                    )
                }
            }
        }
    )
}