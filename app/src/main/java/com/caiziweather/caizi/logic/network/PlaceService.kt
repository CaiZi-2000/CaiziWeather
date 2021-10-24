package com.caiziweather.caizi.logic.network

import com.caiziweather.caizi.CaiziWeatherApplication
import com.caiziweather.caizi.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${CaiziWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}