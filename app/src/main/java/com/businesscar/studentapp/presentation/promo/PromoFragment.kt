package com.businesscar.studentapp.presentation.promo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.businesscar.studentapp.R
import com.businesscar.studentapp.databinding.PromoFragmentBinding

class PromoFragment : Fragment() {

    private val viewBinding by viewBinding(PromoFragmentBinding::bind)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.promo_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding.signIn.setOnClickListener{
            findNavController().navigate(R.id.action_promoFragment_to_authFragment)
        }
    }

}