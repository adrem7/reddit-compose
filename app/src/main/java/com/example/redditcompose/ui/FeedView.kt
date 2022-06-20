package com.example.redditcompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun FeedView(
    paddingValues: PaddingValues,
    model: FeedViewModel = hiltViewModel(),
) {
    LazyColumn() {
        items(items = model.posts) {
            PostCard(it)
        }
    }
}

@Composable
private fun PostCard(post: Post) {
    Card(
        elevation = 20.dp,
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .padding(15.dp, 0.dp, 15.dp, 15.dp)
            .border(1.dp, Color.LightGray, RoundedCornerShape(10.dp))
    ) {
        Column {
            PostHeader(post)
            PostContent(post)
        }
    }
}

@Composable
private fun PostHeader(post: Post) {
    Row(
        modifier = Modifier.padding(15.dp)
    ) {
        Avatar(post)
        Text(text = post.username, fontWeight = FontWeight.Bold)
    }
}

@Composable
private fun Avatar(post: Post) {
    Image(
        painter = painterResource(id = post.userAvatarImage),
        contentDescription = "Avatar for ${post.username}",
        modifier = Modifier
            .size(25.dp)
            .clip(shape = CircleShape)
            .padding(0.dp, 0.dp, 5.dp, 0.dp)
    )
}

@Composable
fun PostContent(post: Post) {
    Column {
        Text(text = post.title)
        Text(text = post.preview)
        PostImage(post = post)
    }
}

@Composable
private fun PostImage(post: Post) {
    Image(
        painter = painterResource(id = post.imageRes),
        contentDescription = post.imageContentDescription,
        modifier = Modifier.padding(8.dp),
    )
}
