package com.example.homework4_task1.data.api

import com.example.homework4_task1.API_KEY
import com.example.homework4_task1.data.entity.WeatherData
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface WeatherApiInterface {

    @GET("/v1/weather")
    suspend fun getTemperatureByCity(
        @Header("X-Api-Key") apiKey : String = API_KEY,
        @Query("city") cityName: String
    ) : WeatherData

}