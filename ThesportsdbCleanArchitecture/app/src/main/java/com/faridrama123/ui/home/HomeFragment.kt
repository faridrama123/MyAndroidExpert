package com.faridrama123.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.faridrama123.R
import com.faridrama123.databinding.FragmentDashboardBinding
import com.faridrama123.databinding.FragmentHomeBinding
import com.faridrama123.ui.dashboard.DashboardViewModel

class HomeFragment : Fragment() {

    //private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return  binding.root

    }
}