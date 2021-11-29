package com.stefandn.pruebacolkie.domain

import com.stefandn.pruebacolkie.data.CakeRepositori
import com.stefandn.pruebacolkie.data.CakesModel
import javax.inject.Inject

class GetAllCakes @Inject constructor(private val cakeRepositori: CakeRepositori) {
    suspend operator fun invoke():CakesModel?=cakeRepositori.getAllCakes()
}