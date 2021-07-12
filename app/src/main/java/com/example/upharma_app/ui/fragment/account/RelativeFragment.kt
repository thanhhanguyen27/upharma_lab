package com.example.upharma_app.ui.fragment.account

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.upharma_app.R
import com.example.upharma_app.adapter.RelativeAdapter
import com.example.upharma_app.databinding.RelativeFragmentBinding
import com.example.upharma_app.model.RelativeInfo
import com.example.upharma_app.ui.viewmodel.account.RelativeViewModel

class RelativeFragment : Fragment(), RelativeAdapter.OnItemButtonClick {

    companion object {
        fun newInstance() = RelativeFragment()
    }

    private lateinit var viewModel: RelativeViewModel
    private lateinit var binding:RelativeFragmentBinding
    private var relations:ArrayList<RelativeInfo> = ArrayList()
    private lateinit var relationAdapter: RelativeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= DataBindingUtil.inflate(inflater, R.layout.relative_fragment, container, false)
        relationAdapter= RelativeAdapter(relations, this)
        binding.rclRelation.apply {
            adapter= relationAdapter
            layoutManager= LinearLayoutManager(context)
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RelativeViewModel::class.java)
    }

    override fun onItemClick(relation: RelativeInfo) {
        TODO("Not yet implemented")
    }

}