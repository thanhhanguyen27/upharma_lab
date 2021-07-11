package com.example.upharma_app.ui.fragment.account

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.upharma_app.R
import com.example.upharma_app.databinding.MedicalRecordFragmentBinding
import com.example.upharma_app.databinding.MedicineFragmentBinding
import com.example.upharma_app.ui.viewmodel.account.MedicalRecordViewModel

class MedicalRecordFragment : Fragment() {

    companion object {
        fun newInstance() = MedicalRecordFragment()
    }

    private lateinit var viewModel: MedicalRecordViewModel
    private lateinit var binding: MedicalRecordFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding= DataBindingUtil.inflate(inflater,R.layout.medical_record_fragment, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MedicalRecordViewModel::class.java)
        // TODO: Use the ViewModel
    }

}