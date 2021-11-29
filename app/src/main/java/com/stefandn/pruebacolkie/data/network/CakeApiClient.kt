package com.stefandn.pruebacolkie.data.network

import com.stefandn.pruebacolkie.data.CakesModel
import retrofit2.Response
import retrofit2.http.GET

interface CakeApiClient {
    @GET("waracle_cake-android-client")
    suspend fun getAllCakes(): Response<CakesModel>
}