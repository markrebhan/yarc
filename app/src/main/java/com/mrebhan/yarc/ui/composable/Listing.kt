package com.mrebhan.yarc.ui.composable

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mrebhan.yarc.ui.theme.Typography
import com.mrebhan.yarc.ui.theme.YetAnotherRedditClientTheme
import com.mrebhan.yarc.vm.Listing
import com.mrebhan.yarc.vm.ListingsViewModel


@Composable
fun Listings(viewModel: ListingsViewModel = viewModel()) {
    val listings = remember { viewModel.listings }

    LazyColumn(contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp)) {
        items(
            items = listings,
            itemContent = {
                ListingItem(item = it)
            }
        )
    }
}

@Composable
fun ListingItem(item: Listing) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(
            corner = CornerSize(16.dp)
        )
    ) {
        Row {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = item.title, style = Typography.body1)
                Text(text = item.title, style = Typography.body2)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    YetAnotherRedditClientTheme {
        Listings(viewModel = viewModel())
    }
}
