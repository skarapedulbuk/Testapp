package com.example.testapp

object Repository {
    val city1 = City("Moscow", -5)
    val city2 = City("Kiev", -8)
    private val weatherList: List<City> = listOf(city1, city2)

    fun getWeatherList(): List<City> {
        return weatherList
    }

    fun copyCity(): City {
        return city2.copy()
    }
}