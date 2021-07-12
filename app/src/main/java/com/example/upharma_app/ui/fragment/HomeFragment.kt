package com.example.upharma_app.ui.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.upharma_app.MainActivity
import com.example.upharma_app.ui.viewmodel.HomeViewModel
import com.example.upharma_app.R
import com.example.upharma_app.adapter.EqualSpacingItemDecoration
import com.example.upharma_app.adapter.MedicineAdapter
import com.example.upharma_app.databinding.HomeFragmentBinding
import com.example.upharma_app.model.ProductInfo

class HomeFragment : Fragment(), MedicineAdapter.OnItemButtonClick {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: HomeFragmentBinding
    private lateinit var medicineAdapter: MedicineAdapter
    private var medicines: ArrayList<ProductInfo> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.hide()
        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)
        medicineAdapter = MedicineAdapter(medicines, this)
        binding.recyclerHomevc.apply {
            adapter = medicineAdapter
            layoutManager=LinearLayoutManager(context)
        }


        binding.apply {
            cardView.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToLiveHealthFragment())
            }
            cardView2.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToDiaryHealthFragment())
            }
            cardView3.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToHealthDeviceFragment())
            }
            cardView4.setOnClickListener {
                findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToMedicineFragment())
            }
        }


        return binding.root
    }

        override fun onActivityCreated(savedInstanceState: Bundle?) {
            super.onActivityCreated(savedInstanceState)
            viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        }

        override fun onItemClick(medicine: ProductInfo) {

        }

}