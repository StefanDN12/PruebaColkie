package com.stefandn.pruebacolkie.data.network

import com.stefandn.pruebacolkie.data.CakeModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CakeService @Inject constructor(private val api: CakeApiClient) {

    suspend fun getCakes(): List<CakeModel>{
        return withContext(Dispatchers.IO){
            val response = api.getAllCakes()
            response.body()?: emptyList()
        }
    }

}