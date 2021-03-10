package faqih.apps.submission.Adapter

import android.view.LayoutInflater
import android.view.OrientationEventListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import faqih.apps.submission.Data.Hebrs
import faqih.apps.submission.databinding.ItemCardviewHerbsBinding

class CardViewHebrsAdapter (private val listHebrs : ArrayList<Hebrs>, val listener: CardViewHebrsAdapter.bind): RecyclerView.Adapter<CardViewHebrsAdapter.CardViewHolder>() {
    class CardViewHolder (val binding: ItemCardviewHerbsBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        return CardViewHolder(
            ItemCardviewHerbsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount(): Int {
        return listHebrs.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val hebrs = listHebrs[position]
        holder.itemView.setOnClickListener {
            listener.onClick(listHebrs[position])
        }

        Glide.with(holder.itemView.context)
            .load(hebrs.image)
            .apply(RequestOptions().override(250, 250))
            .into(holder.binding.imgItem)

        holder.binding.tvItemName.text = hebrs.name
        holder.binding.tvItemDescription.text = hebrs.description
    }

    interface bind{
        fun onClick(data : Hebrs)
    }

}