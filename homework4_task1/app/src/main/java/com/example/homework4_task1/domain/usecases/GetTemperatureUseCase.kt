package com.example.homework4_task1.domain.usecases

import com.example.homework4_task1.data.repository.WeatherDataRepository

class GetTemperatureUseCase(private val weatherDataRepositoryInterface: WeatherDataRepository){

    suspend operator fun invoke(cityName : String) : Int {
        return weatherDataRepositoryInterface.getTemperatureByCity(cityName)
    }

}