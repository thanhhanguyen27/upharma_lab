package com.example.upharma_app.ui.fragment.health.history

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.upharma_app.R
import com.example.upharma_app.ui.viewmodel.health.history.HistoryBMIViewModel

class HistoryBMIFragment : Fragment() {

    companion object {
        fun newInstance() = HistoryBMIFragment()
    }

    private lateinit var viewModel: HistoryBMIViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.history_b_m_i_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HistoryBMIViewModel::class.java)
    }

}