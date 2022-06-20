package com.example.redditcompose.ui

import androidx.lifecycle.ViewModel
import com.example.redditcompose.R
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor() : ViewModel() {

    val posts: List<Post> = listOf(
        Post(
            id = 1,
            imageRes = R.drawable.post_image,
            imageContentDescription = "Image Description",
            title = "Post Title",
            preview = "Post Preview Text Lorem ipsum iFUWJEV jidjvwuv widfhowieh widuhfouwef wfhoewuf",
            username = "DudeWaffleGnomeEater56",
            userAvatarImage = R.drawable.ic_profile,
            userAvatarImageContentDescription = "DudeWaffleGnomeEater56\'s profile pic",
        ),
        Post(
            id = 1,
            imageRes = R.drawable.post_image,
            imageContentDescription = "Image Description",
            title = "Post Title",
            preview = "Post Preview Text Lorem ipsum iFUWJEV jidjvwuv widfhowieh widuhfouwef wfhoewuf",
            username = "DudeWaffleGnomeEater56",
            userAvatarImage = R.drawable.ic_profile,
            userAvatarImageContentDescription = "DudeWaffleGnomeEater56\'s profile pic",
        )
    )
}