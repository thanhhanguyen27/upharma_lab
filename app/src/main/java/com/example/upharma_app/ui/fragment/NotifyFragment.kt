package com.example.upharma_app.ui.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.upharma_app.ui.viewmodel.NotifyViewModel
import com.example.upharma_app.R

class NotifyFragment : Fragment() {

    companion object {
        fun newInstance() = NotifyFragment()
    }

    private lateinit var viewModel: NotifyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
        return inflater.inflate(R.layout.notify_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NotifyViewModel::class.java)
        // TODO: Use the ViewModel
    }

}