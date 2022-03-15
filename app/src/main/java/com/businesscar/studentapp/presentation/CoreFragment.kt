package com.businesscar.studentapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

abstract class CoreFragment<VB : ViewBinding, S>(
    viewBindingInflate: (LayoutInflater) -> VB,
    private val viewModelClass: Class<out CoreViewModel<S>>
) : ViewBindingFragment<VB>(viewBindingInflate) {

    abstract suspend fun render(state: S)

    protected lateinit var viewModel: CoreViewModel<S>

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(viewModelClass)
        lifecycleScope.launch {
            viewModel.stateFlow.collectLatest {
                if (it != null) {
                    render(it)
                }
            }
        }
    }
}
