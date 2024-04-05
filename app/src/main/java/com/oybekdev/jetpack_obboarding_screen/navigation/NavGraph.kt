package com.oybekdev.jetpack_obboarding_screen.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.oybekdev.jetpack_obboarding_screen.HomeScreen
import com.oybekdev.jetpack_obboarding_screen.screen.Screens
import com.oybekdev.jetpack_obboarding_screen.screen.WelcomeScreen

@Composable
fun SetUpNavGraph(
    navController: NavController,
    startDestination:String
){
    NavHost(
        navController = navController as NavHostController, startDestination = startDestination){
        composable(route = Screens.Welcome.route){
            WelcomeScreen(navController = navController)
        }
        composable(route = Screens.Home.route){
            HomeScreen()
        }
    }
}