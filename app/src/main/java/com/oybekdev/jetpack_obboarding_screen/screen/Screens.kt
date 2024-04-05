package com.oybekdev.jetpack_obboarding_screen.screen

sealed class Screens(val route:String){
    object Welcome:Screens(route = "welcome_screen")
    object Home:Screens(route = "home_screen")
}
