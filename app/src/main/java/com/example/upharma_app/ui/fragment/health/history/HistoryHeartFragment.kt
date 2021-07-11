package com.example.upharma_app.ui.fragment.health.history

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.upharma_app.R
import com.example.upharma_app.ui.viewmodel.health.history.HistoryHeartViewModel

class HistoryHeartFragment : Fragment() {

    companion object {
        fun newInstance() = HistoryHeartFragment()
    }

    private lateinit var viewModel: HistoryHeartViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.history_heart_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HistoryHeartViewModel::class.java)
        // TODO: Use the ViewModel
    }

}