package com.businesscar.studentapp.presentation.vacancy_info

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.businesscar.studentapp.R
import com.businesscar.studentapp.databinding.VacancyInfoFragmentBinding

class VacancyInfoFragment : DialogFragment() {

    private lateinit var viewModel: VacancyInfoViewModel

    private val args: VacancyInfoFragmentArgs by navArgs()

    private val viewBinding by viewBinding<VacancyInfoFragment, VacancyInfoFragmentBinding>(
        VacancyInfoFragmentBinding::bind
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.vacancy_info_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        viewModel = ViewModelProvider(this)[VacancyInfoViewModel::class.java]

        val item = args.vacancyEntity
        viewBinding.employeePosition.text = item.positionAtWork
        viewBinding.addressName.text = item.addressName
        viewBinding.brandName.text = item.brand
        viewBinding.companyName.text = item.companyName

        Glide.with(viewBinding.companyLogo).load(item.logoUrl).into(viewBinding.companyLogo)
    }

}