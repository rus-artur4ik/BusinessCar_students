package com.businesscar.studentapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class ViewBindingFragment<VB : ViewBinding>(
    private val viewBindingInflate: (LayoutInflater) -> VB
) : Fragment() {

    private var viewBindingInternal: VB? = null

    val viewBinding: VB
        get() = viewBindingInternal
            ?: throw NullPointerException("ViewBinding is already destroyed or not initialized yet")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindingInternal = viewBindingInflate(inflater)
        return viewBindingInternal!!.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBindingInternal = null
    }
}