package com.example.upharma_app.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.upharma_app.R
import com.example.upharma_app.databinding.ItemMedicineBinding
import com.example.upharma_app.model.ProductInfo

class MedicineAdapter (private var medicines:List<ProductInfo> , private val onItemButtonClick: OnItemButtonClick): RecyclerView.Adapter<MedicineAdapter.ViewHolder>() {
    private var mRowIndex = -1
    class ViewHolder(
        var binding: ItemMedicineBinding,
        private val onItemButtonClick: OnItemButtonClick,
    ): RecyclerView.ViewHolder(binding.root){
        fun bindView(medicine: ProductInfo) {
            binding.medicine=medicine
            binding.root.setOnClickListener{
                onItemButtonClick.onItemClick(medicine)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val binding= DataBindingUtil.inflate<ItemMedicineBinding>(layoutInflater, R.layout.item_medicine,parent, false)
        return MedicineAdapter.ViewHolder(binding, onItemButtonClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val medicine= medicines[position]
        holder.bindView(medicine)
    }

    override fun getItemCount(): Int {
        return medicines.size
    }

    fun setListData(data:List<ProductInfo>){
        this.medicines = data
        notifyDataSetChanged()
    }

    fun setRowIndex(index: Int) {
        mRowIndex = index
    }

    interface OnItemButtonClick{
        fun onItemClick(medicine:ProductInfo)
    }

}