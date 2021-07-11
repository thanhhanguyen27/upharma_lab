package com.example.upharma_app.ui.fragment.medicine

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.upharma_app.R
import com.example.upharma_app.databinding.MedicalInfoFragmentBinding
import com.example.upharma_app.ui.viewmodel.medicine.MedicalInfoViewModel


class MedicalInfoFragment : Fragment() {

    companion object {
        fun newInstance() = MedicalInfoFragment()
    }

    private lateinit var viewModel: MedicalInfoViewModel
    private lateinit var binding: MedicalInfoFragmentBinding

    @SuppressLint("ResourceAsColor")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor("#FFFFFF")))
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding= DataBindingUtil.inflate(inflater, R.layout.medical_info_fragment, container, false)


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MedicalInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}