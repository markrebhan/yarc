package com.mrebhan.yarc

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mrebhan.yarc.ui.composable.Listings
import com.mrebhan.yarc.ui.composable.MainNavHost
import com.mrebhan.yarc.ui.theme.YetAnotherRedditClientTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YetAnotherRedditClientTheme {
                Scaffold(
                    content = {
                        MainNavHost()
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YetAnotherRedditClientTheme {
        Listings()
    }
}