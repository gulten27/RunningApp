package com.gultendogan.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.gultendogan.runningapp.R
import com.gultendogan.runningapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

    private val viewModel: MainViewModel by viewModels()
}