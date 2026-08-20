package com.moive.app.presentation.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.moive.app.core.designsystem.theme.MoiveTheme

@Composable
fun HomeRoute(
    modifier: Modifier = Modifier,
) {
    HomeScreen(
        modifier = modifier,
    )
}

@Composable
private fun HomeScreen(
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = "Home Screen")
    }
}


@Preview(showBackground = true)
@Composable
private fun HomeScreenPreview() {
    MoiveTheme {
        HomeScreen()
    }
}
