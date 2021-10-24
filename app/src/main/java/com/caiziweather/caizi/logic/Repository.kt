package com.caiziweather.caizi.logic

import androidx.lifecycle.liveData
import com.caiziweather.caizi.logic.model.Place
import kotlinx.coroutines.Dispatchers
import com.caiziweather.caizi.logic.network.CaiziWeatherNetwork

object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = CaiziWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}