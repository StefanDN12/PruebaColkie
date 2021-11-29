package com.stefandn.pruebacolkie.data

import com.stefandn.pruebacolkie.data.network.CakeService
import javax.inject.Inject

class CakeRepositori @Inject constructor(private val api: CakeService, private val cakesProvider: CakeProvider){
    suspend fun getAllCakes(): CakesModel{
        val response: CakesModel = api.getCakes()
        cakesProvider.Cakes = response
        return response
    }

}