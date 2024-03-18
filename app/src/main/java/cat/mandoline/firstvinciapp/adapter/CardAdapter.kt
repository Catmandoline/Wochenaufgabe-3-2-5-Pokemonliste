package cat.mandoline.firstvinciapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cat.mandoline.firstvinciapp.data.model.Pokemon
import cat.mandoline.firstvinciapp.databinding.ListPokemonBinding

class CardAdapter(
    private val pokemonList: List<Pokemon>
) : RecyclerView.Adapter<CardAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: ListPokemonBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListPokemonBinding.inflate(inflater, parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val pokemon = pokemonList[position]
        holder.binding.imageViewPokemon.setImageResource(pokemon.imageResource)
        holder.binding.tvNamePokemon.setText(pokemon.name)
        holder.binding.tvNumberPokemon.setText(pokemon.number)
        holder.binding.tvElementPokemon.setText(pokemon.element)
    }

    override fun getItemCount(): Int {
        return pokemonList.size
    }
}