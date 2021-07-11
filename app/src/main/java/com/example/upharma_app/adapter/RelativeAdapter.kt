package com.example.upharma_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.upharma_app.R
import com.example.upharma_app.databinding.ItemMedicineBinding
import com.example.upharma_app.databinding.ItemRelativeBinding
import com.example.upharma_app.model.ProductInfo
import com.example.upharma_app.model.RelativeInfo

class RelativeAdapter  (private var relations:List<RelativeInfo>, private val onItemButtonClick: OnItemButtonClick): RecyclerView.Adapter<RelativeAdapter.ViewHolder>() {

    class ViewHolder(
        var binding: ItemRelativeBinding,
        private val onItemButtonClick: OnItemButtonClick,
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bindView(relation: RelativeInfo) {

            binding.root.setOnClickListener {
                onItemButtonClick.onItemClick(relation)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemRelativeBinding>(
            layoutInflater,
            R.layout.item_relative,
            parent,
            false
        )
        return RelativeAdapter.ViewHolder(binding, onItemButtonClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val relation = relations[position]
        holder.bindView(relation)
    }

    override fun getItemCount(): Int {
        return relations.size
    }

    fun setListData(data: List<RelativeInfo>) {
        this.relations = data
        notifyDataSetChanged()
    }

    interface OnItemButtonClick {
        fun onItemClick(relation: RelativeInfo)
    }
}

