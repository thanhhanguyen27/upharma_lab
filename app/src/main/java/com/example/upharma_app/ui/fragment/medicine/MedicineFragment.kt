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
import com.example.upharma_app.databinding.MedicineFragmentBinding
import com.example.upharma_app.ui.viewmodel.medicine.MedicineViewModel

class MedicineFragment : Fragment() {

    companion object {
        fun newInstance() = MedicineFragment()
    }

    private lateinit var viewModel: MedicineViewModel
    private lateinit var binding:MedicineFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding= DataBindingUtil.inflate(inflater, R.layout.medicine_fragment, container, false)
        binding.apply {
            nhathuoc.setOnClickListener {
                findNavController().navigate(MedicineFragmentDirections.actionMedicineFragmentToDrugstoreOnlineFragment())
            }
            donthuoconline.setOnClickListener {
                findNavController().navigate(MedicineFragmentDirections.actionMedicineFragmentToPrescriptionOnlineFragment())
            }
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MedicineViewModel::class.java)
        // TODO: Use the ViewModel
    }

}