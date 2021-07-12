package com.example.upharma_app.ui.fragment.diaryhealth

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnTouchListener
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.upharma_app.R
import com.example.upharma_app.databinding.DiaryHealthFragmentBinding
import com.example.upharma_app.ui.viewmodel.diaryhealth.DiaryHealthViewModel


class DiaryHealthFragment : Fragment() {

    companion object {
        fun newInstance() = DiaryHealthFragment()
    }

    private lateinit var viewModel: DiaryHealthViewModel
    private lateinit var binding: DiaryHealthFragmentBinding

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.show()
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding= DataBindingUtil.inflate(inflater, R.layout.diary_health_fragment, container, false)
        binding.apply {

            edtCamXuc.setOnTouchListener(OnTouchListener { v, event ->
                val DRAWABLE_LEFT = 0
                val DRAWABLE_TOP = 1
                val DRAWABLE_RIGHT = 2
                val DRAWABLE_BOTTOM = 3
                if (event.action == MotionEvent.ACTION_DOWN) {
                    if (event.rawX >= edtCamXuc.getRight() - edtCamXuc.getCompoundDrawables()
                            .get(DRAWABLE_RIGHT).getBounds().width()
                    ) {
                        Toast.makeText(context, "ok", Toast.LENGTH_SHORT).show()
                        return@OnTouchListener true
                    }
                }
                false
            })
        }


        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DiaryHealthViewModel::class.java)
    }

}