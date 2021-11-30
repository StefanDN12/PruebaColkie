package com.stefandn.pruebacolkie.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.stefandn.pruebacolkie.R
import com.stefandn.pruebacolkie.core.Utils
import com.stefandn.pruebacolkie.data.CakeModel
import com.stefandn.pruebacolkie.databinding.CakeItemBinding
import javax.inject.Inject

class CakeAdapter @Inject constructor(cake: List<CakeModel>,private val context: Context, private val listener: (cake : CakeModel) -> Unit ): RecyclerView.Adapter<CakeAdapter.CakeHolder>() {

    var cakesList: List<CakeModel> = cake


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CakeAdapter.CakeHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CakeHolder(layoutInflater.inflate(R.layout.cake_item, parent, false),context)
    }

    override fun onBindViewHolder(holder: CakeHolder, position: Int) {
        val allCakes =cakesList[position]
        holder.render(allCakes)

        holder.itemView.setOnClickListener {
            listener.invoke(allCakes)
        }

    }

    override fun getItemCount(): Int = cakesList.size

    class CakeHolder(view: View, private val context: Context): RecyclerView.ViewHolder(view){
        private val binding = CakeItemBinding.bind(view)

        fun render(cake: CakeModel){
            Glide.with(context).load(Utils().generateGlideUrl(cake.image)).into(binding.imgCake)
            binding.txtCakeTitle.text = cake.title
        }
    }
}