package com.example.upharma_app.ui.fragment.medicine

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.upharma_app.R
import com.example.upharma_app.adapter.MedicineAdapter
import com.example.upharma_app.databinding.DrugstoreOnlineFragmentBinding
import com.example.upharma_app.model.ProductInfo
import com.example.upharma_app.ui.viewmodel.medicine.DrugstoreOnlineViewModel

class DrugstoreOnlineFragment : Fragment(), MedicineAdapter.OnItemButtonClick {

    companion object {
        fun newInstance() = DrugstoreOnlineFragment()
    }

    private lateinit var viewModel: DrugstoreOnlineViewModel
    private lateinit var binding: DrugstoreOnlineFragmentBinding
    private var medicines:ArrayList<ProductInfo> = ArrayList()
    private lateinit var medicineAdapter:MedicineAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding= DataBindingUtil.inflate(inflater, R.layout.drugstore_online_fragment, container, false)
        medicineAdapter= MedicineAdapter(medicines, this)

        return  binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DrugstoreOnlineViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onItemClick(medicine: ProductInfo) {
        findNavController().navigate(DrugstoreOnlineFragmentDirections.actionDrugstoreOnlineFragmentToMedicalInfoFragment(medicine))
    }

}