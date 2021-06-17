package com.fcgsolucoes.cgv.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fcgsolucoes.cgv.R

class uIFragment : Fragment() {

    private lateinit var viewModel: UIViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.u_i_fragment, container, false)
    }

}