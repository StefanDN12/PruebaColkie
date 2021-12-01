package com.stefandn.pruebacolkie.ui.viewModels
import android.app.Instrumentation
import androidx.test.platform.app.InstrumentationRegistry
import com.stefandn.pruebacolkie.data.CakeModel
import com.stefandn.pruebacolkie.domain.GetAllCakes
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory
import junit.framework.Assert.assertEquals
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test

class CakeViewModelTest{
    private lateinit var cakeViewModel: CakeViewModel
    private var fakeCake: CakeModel = CakeModel("Example", "Example description", "Example Img")
    private var fakeList: List<CakeModel> = listOf(fakeCake)

    @Before
    fun setup(){
        val instrument = InstrumentationRegistry.getInstrumentation().context

       // cakeViewModel = CakeViewModel(instrument)
    }
    @Test
    fun testSortedAndDuplicatedCakes(){
        cakeViewModel.sortedAndDuplicatedCakes(fakeList)

        var result2 = fakeList?.distinctBy { Pair(it.title,it.title) }
        var sorted = result2?.sortedWith(compareBy(String.CASE_INSENSITIVE_ORDER, { it.title }))

        assertEquals(sorted,cakeViewModel.sortedAndDuplicatedCakes(fakeList))
    }
}