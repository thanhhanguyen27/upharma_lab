package com.example.upharma_app.ui.fragment.account

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
import com.example.upharma_app.databinding.AccountFragmentBinding
import com.example.upharma_app.ui.viewmodel.account.AccountViewModel

class AccountFragment : Fragment() {

    companion object {
        fun newInstance() = AccountFragment()
    }

    private lateinit var viewModel: AccountViewModel
    private lateinit var binding: AccountFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.hide()

        binding = DataBindingUtil.inflate(inflater, R.layout.account_fragment, container, false)
        binding.apply {
            lnFamily.setOnClickListener {
                findNavController().navigate(AccountFragmentDirections.actionNavAccountToRelativeFragment())
            }
            DrugStore.setOnClickListener {
                findNavController().navigate(AccountFragmentDirections.actionNavAccountToDrugstoreOnlineFragment())
            }
            lnHSYT.setOnClickListener {
                findNavController().navigate(AccountFragmentDirections.actionNavAccountToMedicalRecordFragment())
            }
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AccountViewModel::class.java)
    }

}