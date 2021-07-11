package com.example.upharma_app.ui.fragment.login

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.upharma_app.R
import com.example.upharma_app.ui.viewmodel.login.ForgetPassViewModel

class ForgetPassFragment : Fragment() {

    companion object {
        fun newInstance() = ForgetPassFragment()
    }

    private lateinit var viewModel: ForgetPassViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)

        return inflater.inflate(R.layout.forget_pass_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ForgetPassViewModel::class.java)
        // TODO: Use the ViewModel
    }

}