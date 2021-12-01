package com.stefandn.pruebacolkie.ui

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import android.transition.TransitionManager
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupWindow
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.DividerItemDecoration
import com.stefandn.pruebacolkie.R
import com.stefandn.pruebacolkie.data.CakeModel
import com.stefandn.pruebacolkie.databinding.ActivityMainBinding
import com.stefandn.pruebacolkie.ui.adapters.CakeAdapter
import com.stefandn.pruebacolkie.ui.viewModels.CakeViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val CakeViewModel: CakeViewModel by viewModels()
    private lateinit var adapter: CakeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        obtenerDatos()
        swipetoRefresh()
        binding.btnRetry.setOnClickListener {
            recargarDatos()
        }
        binding.cakeRecycler.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
    }

    fun obtenerDatos(){
        CakeViewModel.onCreate()

        CakeViewModel.cakes.observe(this,{
            adapter = CakeAdapter(it, this, listener)
            binding.cakeRecycler.adapter = adapter
            binding.cakeRecycler.setHasFixedSize(true)


        })

        CakeViewModel.isLoading.observe(this, {
            if(it){
                binding.progress.visibility = View.VISIBLE
            }else{
                binding.progress.visibility = View.GONE
            }
        })

        CakeViewModel.isError.observe(this, {
            if(it){
                binding.btnRetry.visibility = View.VISIBLE
            }else{
                binding.btnRetry.visibility = View.GONE
            }
        })
    }
    private val listener :(cakes : CakeModel) -> Unit = { cake ->
        val inflater: LayoutInflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.pop_up_cake,null)

        val popUp = PopupWindow(
            view,
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            popUp.elevation = 10.0F
        }
        val txtBody = view.findViewById<AppCompatTextView>(R.id.text_view)
        val btnOk = view.findViewById<Button>(R.id.button_popup)

        txtBody.text = cake.desc
        btnOk.setOnClickListener {
            popUp.dismiss()
        }
        TransitionManager.beginDelayedTransition(binding.actvMain)
        popUp.showAtLocation(
            binding.actvMain, // Location to display popup window
            Gravity.CENTER, // Exact position of layout to display popup
            0, // X offset
            0 // Y offset
        )
    }
    fun swipetoRefresh(){
        binding.swipeContainer.setOnRefreshListener {
            obtenerDatos()
            binding.swipeContainer.setRefreshing(false);
        }
    }

    fun recargarDatos(){
        obtenerDatos()
    }

    //TODO Animatio feed
}