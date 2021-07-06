package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

//superherolistfa <===> SuperHeroListaForAdapter
class HeroAdapter (val superherolistfa:List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>(){

    //Metodo que crea el ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.list_item, parent, false))
    }

    //Titular de vista enlazada
    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superherolistfa[position])
    }

    //Metodo que retorna el tamaño de la lista
    override fun getItemCount(): Int = superherolistfa.size


    //Pinta los list Items
    class HeroHolder(val view:View):RecyclerView.ViewHolder(view){
        fun render(superherolistfa: SuperHero){


        }
    }

}