package com.oybekdev.jetpack_obboarding_screen.utils

import androidx.annotation.DrawableRes
import com.oybekdev.jetpack_obboarding_screen.R

sealed class OnBoardingPage(
    @DrawableRes
    val image:Int,
    val title:String,
    val description:String
){
    object First:OnBoardingPage(
        image = R.drawable.java,
        title = "Java",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus consequat sit amet dui nec aliquet."
    )
    object Second:OnBoardingPage(
        image = R.drawable.kotlin,
        title = "Kotlin",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus consequat sit amet dui nec aliquet."
    )
    object Third:OnBoardingPage(
        image = R.drawable.img,
        title = "Jetpack Compose",
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus consequat sit amet dui nec aliquet."
    )
}
