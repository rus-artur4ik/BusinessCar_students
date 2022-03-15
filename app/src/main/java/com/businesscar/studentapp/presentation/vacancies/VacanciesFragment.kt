package com.businesscar.studentapp.presentation.vacancies

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.businesscar.studentapp.databinding.VacanciesFragmentBinding
import com.businesscar.studentapp.databinding.VacancyItemBinding
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
            cat2AdapterDelegate()
        )

        super.onViewCreated(view, savedInstanceState)
    }

    private fun cat2AdapterDelegate() = adapterDelegateViewBinding<VacancyItem, VacancyItem, VacancyItemBinding>(
        { layoutInflater, root -> VacancyItemBinding.inflate(layoutInflater, root, false) }
    ) {
        bind {
            binding.companyName.text = item.companyName
            binding.employeePosition.text = item.employeePosition
            binding.brandName.text = item.brandName
            binding.address.text = item.addressName
        }
    }

    data class VacanciesFragmentState(
        val items: List<VacancyItem>
    )
}