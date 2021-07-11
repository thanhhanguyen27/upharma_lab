package com.example.upharma_app.ui.fragment.health

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.upharma_app.R
import com.example.upharma_app.databinding.HealthDeviceFragmentBinding
import com.example.upharma_app.ui.viewmodel.health.HealthDeviceViewModel

class HealthDeviceFragment : Fragment() {

    companion object {
        fun newInstance() = HealthDeviceFragment()
    }

    private lateinit var viewModel: HealthDeviceViewModel
    private lateinit var binding:HealthDeviceFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding= DataBindingUtil.inflate(inflater, R.layout.health_device_fragment, container, false)
        binding.apply {
            cvBMI.setOnClickListener {
                findNavController().navigate(HealthDeviceFragmentDirections.actionHealthDeviceFragmentToBMIFragment())
            }
            cvDuonghuyet.setOnClickListener {
                findNavController().navigate(HealthDeviceFragmentDirections.actionHealthDeviceFragmentToBloodSugarFragment())
            }
            cvHuyetAp.setOnClickListener {
                findNavController().navigate(HealthDeviceFragmentDirections.actionHealthDeviceFragmentToBloodPressureFragment())
            }
            cvNhipTim.setOnClickListener {
                findNavController().navigate(HealthDeviceFragmentDirections.actionHealthDeviceFragmentToHeartFragment())
            }
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_connect, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HealthDeviceViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.connect ->{

                return true
            }
            else -> {
                super.onOptionsItemSelected(item)
            }
        }
    }

}