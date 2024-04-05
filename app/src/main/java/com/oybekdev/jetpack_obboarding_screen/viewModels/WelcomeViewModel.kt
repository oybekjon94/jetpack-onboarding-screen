package com.oybekdev.jetpack_obboarding_screen.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oybekdev.jetpack_obboarding_screen.data.DataStoreRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor(
    private val repository: DataStoreRepository
):ViewModel() {
    fun saveOnBoardingState(completed:Boolean){
        viewModelScope.launch ( Dispatchers.IO ){
            repository.saveOnBoardingState(completed = completed)
        }
    }
}