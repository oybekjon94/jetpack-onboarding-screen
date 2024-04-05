package com.oybekdev.jetpack_obboarding_screen.viewModels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oybekdev.jetpack_obboarding_screen.data.DataStoreRepository
import com.oybekdev.jetpack_obboarding_screen.screen.Screens
import kotlinx.coroutines.launch
import javax.inject.Inject


class SplashViewModel @Inject constructor(
    private val repository: DataStoreRepository
):ViewModel(){

    private val _isLoading: MutableState<Boolean> = mutableStateOf(true)
    val isLoading:State<Boolean> = _isLoading

    private val _startDestination:MutableState<String> = mutableStateOf(Screens.Home.route)
    val startDestination:State<String> = _startDestination

    init {
        viewModelScope.launch {
            repository.readBoardingState().collect{completed ->
                if (completed){
                    _startDestination.value = Screens.Home.route
                }else{
                    _startDestination.value = Screens.Welcome.route
                }
            }
            _isLoading.value = false
        }
    }
}