package com.example.homework4_task1.presentation.main.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homework4_task1.data.api.weatherApiRequest
import com.example.homework4_task1.data.repository.WeatherDataRepository
import com.example.homework4_task1.domain.usecases.GetTemperatureUseCase
import kotlinx.coroutines.launch


class MainFragmentViewModel : ViewModel() {

    val temperatureLiveData = MutableLiveData<Int>()

    private val getTemperatureUseCase = GetTemperatureUseCase(WeatherDataRepository(weatherApiRequest()))

    fun getTemperature(locationName : String) {
        viewModelScope.launch {
            val currentTemperature = getTemperatureUseCase(locationName)
            temperatureLiveData.postValue(currentTemperature)
        }
    }

}