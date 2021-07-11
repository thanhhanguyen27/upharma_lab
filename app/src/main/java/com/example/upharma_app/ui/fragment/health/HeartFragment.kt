package com.example.upharma_app.ui.fragment.health

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.upharma_app.R
import com.example.upharma_app.databinding.HealthDeviceFragmentBinding
import com.example.upharma_app.databinding.HeartFragmentBinding
import com.example.upharma_app.ui.viewmodel.health.HeartViewModel

class HeartFragment : Fragment() {

    companion object {
        fun newInstance() = HeartFragment()
    }

    private lateinit var viewModel: HeartViewModel
    private lateinit var binding:HeartFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding= DataBindingUtil.inflate(inflater,R.layout.heart_fragment, container, false)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HeartViewModel::class.java)
        // TODO: Use the ViewModel
    }

}