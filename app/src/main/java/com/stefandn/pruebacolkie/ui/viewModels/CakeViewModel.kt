package com.stefandn.pruebacolkie.ui.viewModels

import android.content.Context
import android.net.ConnectivityManager
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.stefandn.pruebacolkie.data.CakeModel
import com.stefandn.pruebacolkie.domain.GetAllCakes
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class CakeViewModel@Inject constructor(private val getAllCakes: GetAllCakes,@ApplicationContext private val appContext: Context): ViewModel() {
        val cakes = MutableLiveData<List<CakeModel>>()
        val isLoading = MutableLiveData<Boolean>()
        val isError = MutableLiveData<Boolean>()

        fun onCreate(){
                val conexion = (appContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetwork
                if(conexion != null) {
                        viewModelScope.launch {
                                isLoading.postValue(true)
                                isError.postValue(false)

                                val result: List<CakeModel>? = getAllCakes()
                                if (!result.isNullOrEmpty()) {
                                        cakes.postValue(sortedAndDuplicatedCakes(result)!!)
                                        isLoading.postValue(false)
                                } else {
                                        Toast.makeText(appContext, "Error la lista esta vacia", Toast.LENGTH_SHORT)
                                                .show()
                                        isError.postValue(true)
                                }

                        }
                }else{
                       isError.postValue(true)
                        Toast.makeText(appContext, "Error no hay conexion", Toast.LENGTH_LONG)
                                .show()
                }
        }

        private fun sortedAndDuplicatedCakes(result: List<CakeModel>): List<CakeModel>{
                var result2 = result?.distinctBy { Pair(it.title,it.title) }
                var sorted = result2?.sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER, { it.title }))
                return sorted
        }

}