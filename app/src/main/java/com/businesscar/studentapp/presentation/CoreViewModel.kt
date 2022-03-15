package com.businesscar.studentapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

abstract class CoreViewModel<S>(defaultState: S? = null) : ViewModel() {

    private val state = MutableStateFlow(defaultState)

    val stateFlow: StateFlow<S?> get() = state

    protected fun applyState(newState: S) {
        viewModelScope.launch {
            state.emit(newState)
        }
    }
}
