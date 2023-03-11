package com.example.homework4_task1.data.repository

import com.example.homework4_task1.data.api.WeatherApiInterface
import com.example.homework4_task1.data.api.weatherApiRequest

class WeatherDataRepository(private val weatherApiRequest : WeatherApiInterface) {

    suspend fun getTemperatureByCity(cityName : String) : Int {
            val data = weatherApiRequest().getTemperatureByCity(cityName = cityName)
            return data.temp
    }

}