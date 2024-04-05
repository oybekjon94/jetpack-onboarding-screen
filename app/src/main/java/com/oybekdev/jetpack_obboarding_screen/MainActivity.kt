package com.oybekdev.jetpack_obboarding_screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.oybekdev.jetpack_obboarding_screen.navigation.SetUpNavGraph
import com.oybekdev.jetpack_obboarding_screen.ui.theme.JetpackobboardingscreenTheme
import com.oybekdev.jetpack_obboarding_screen.viewModels.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().setKeepOnScreenCondition{
            !splashViewModel.isLoading.value
        }

        setContent {
            JetpackobboardingscreenTheme {
                val screen by splashViewModel.startDestination
                val navController = rememberNavController()
                SetUpNavGraph(navController = navController, startDestination = screen)
            }
        }
    }
}
