package com.stefandn.pruebacolkie.data

import javax.inject.Inject

class CakeProvider @Inject constructor() {
        var Cakes: List<CakeModel>? = emptyList()
}