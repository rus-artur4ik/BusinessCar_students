package com.businesscar.studentapp.presentation.vacancies

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.businesscar.studentapp.databinding.VacanciesFragmentBinding
import com.businesscar.studentapp.databinding.VacancyItemBinding
import com.businesscar.studentapp.domain.entity.VacancyEntity
import com.businesscar.studentapp.presentation.CoreFragment
import com.businesscar.studentapp.presentation.vacancies.VacanciesFragment.VacanciesFragmentState
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter
import com.hannesdorfmann.adapterdelegates4.dsl.adapterDelegateViewBinding

class VacanciesFragment : CoreFragment<VacanciesFragmentBinding, VacanciesFragmentState>(
    VacanciesFragmentBinding::inflate,
    VacanciesViewModel::class.java
) {

    private val adapter get() = viewBinding.recyclerView.adapter as ListDelegationAdapter<*>

    override suspend fun render(state: VacanciesFragmentState) {
        adapter.items = state.items
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewBinding.recyclerView.layoutManager = LinearLayoutManager(context)
        viewBinding.recyclerView.adapter = ListDelegationAdapter(
            vacancyAdapterDelegate()
        )

        super.onViewCreated(view, savedInstanceState)
    }

    private fun vacancyAdapterDelegate() = adapterDelegateViewBinding<VacancyEntity, VacancyEntity, VacancyItemBinding>(
        { layoutInflater, root -> VacancyItemBinding.inflate(layoutInflater, root, false) }
    ) {
        binding.moreInfoButton.setOnClickListener {
            val action = VacanciesFragmentDirections.actionVacanciesFragmentToVacancyInfoFragment(item)
            findNavController().navigate(action)
        }
        bind {
            binding.companyName.text = item.companyName
            binding.employeePosition.text = item.positionAtWork
            binding.brandName.text = item.brand
            binding.address.text = item.addressName
        }
    }

    data class VacanciesFragmentState(
        val items: List<VacancyEntity>
    )
}