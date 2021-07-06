package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ListItemBinding
import com.squareup.picasso.Picasso

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

        //Debido al nombre del list_iem se nombra de este modo
        val binding = ListItemBinding.bind(view)

        fun render(superherolistfa: SuperHero){
            binding.tvSuperHero.text = superherolistfa.superHero
            binding.tvRealName.text = superherolistfa.realName
            binding.tvPublisher.text = superherolistfa.publisher

            Picasso.get().load(superherolistfa.image).into(binding.ivHero)
        }
    }

}