package com.businesscar.studentapp.presentation.cabinet

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.businesscar.studentapp.R
import com.businesscar.studentapp.databinding.FragmentCabinetBinding
import com.businesscar.studentapp.presentation.ViewBindingFragment

class CabinetFragment : ViewBindingFragment<FragmentCabinetBinding>(FragmentCabinetBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.vacancies.setOnClickListener {
            findNavController().navigate(R.id.action_cabinetFragment_to_vacanciesFragment)
        }
    }
}