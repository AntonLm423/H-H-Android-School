package com.example.homework4_task1.data.api

import com.example.homework4_task1.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


fun weatherApiRequest(): WeatherApiInterface =
    Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()
        .create(WeatherApiInterface::class.java)
