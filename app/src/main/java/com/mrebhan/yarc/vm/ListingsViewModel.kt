package com.mrebhan.yarc.vm

import androidx.lifecycle.ViewModel

class ListingsViewModel : ViewModel() {

    val listings = listOf(
        Listing("Test 1", "r/worldnews"),
        Listing("Test 2", "r/worldnews"),
        Listing("Test 3", "r/worldnews"),
        Listing("Test 4", "r/worldnews"),
        Listing("Test 5", "r/worldnews"),
        Listing("Test 6", "r/worldnews"),
        Listing("Test 7", "r/worldnews"),
        Listing("Test 8", "r/worldnews"),
    )
}

data class Listing(
    val title: String,
    val subreddit: String
)