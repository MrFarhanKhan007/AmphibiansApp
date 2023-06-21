package com.example.amphibiansapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.amphibiansapp.R
import com.example.amphibiansapp.ui.screens.AmphibianViewModel
import com.example.amphibiansapp.ui.screens.HomeScreen


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AmphibianApp() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        stringResource(R.string.app_name),
                        style = MaterialTheme.typography.headlineMedium
                    )
                }
            )
        }
    )  {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            color = MaterialTheme.colorScheme.background
        ) {
            val amphibianViewModel: AmphibianViewModel =
                viewModel(factory = AmphibianViewModel.Factory)
            HomeScreen(
                amphibiansUiState = amphibianViewModel.amphibianUiState,
                retryAction = amphibianViewModel::getAmphibians
            )
        }

    }
}

@Preview
@Composable
fun AmphibianAppPreview() {
    AmphibianApp()
}

