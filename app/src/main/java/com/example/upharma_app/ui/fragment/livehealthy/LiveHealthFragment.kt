package com.example.upharma_app.ui.fragment.livehealthy

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.upharma_app.R
import com.example.upharma_app.ui.viewmodel.livehealthy.LiveHealthViewModel

class LiveHealthFragment : Fragment() {

    companion object {
        fun newInstance() = LiveHealthFragment()
    }

    private lateinit var viewModel: LiveHealthViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        return inflater.inflate(R.layout.live_health_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LiveHealthViewModel::class.java)
        // TODO: Use the ViewModel
    }

}