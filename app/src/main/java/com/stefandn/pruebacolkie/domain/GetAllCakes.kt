package com.stefandn.pruebacolkie.domain

import com.stefandn.pruebacolkie.data.CakeModel
import com.stefandn.pruebacolkie.data.CakeRepositori
import javax.inject.Inject


class GetAllCakes @Inject constructor(private val cakeRepositori: CakeRepositori) {
    suspend operator fun invoke(): List<CakeModel>?=cakeRepositori.getAllCakes()
}