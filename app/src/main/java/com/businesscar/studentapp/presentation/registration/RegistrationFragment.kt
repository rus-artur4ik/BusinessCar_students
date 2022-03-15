package com.businesscar.studentapp.presentation.registration

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.businesscar.studentapp.R
import com.businesscar.studentapp.databinding.RegistrationFragmentBinding
import com.businesscar.studentapp.presentation.CoreFragment

class RegistrationFragment : CoreFragment<RegistrationFragmentBinding, Any>(
    RegistrationFragmentBinding::inflate,
    RegistrationViewModel::class.java
) {


    override suspend fun render(state: Any) {
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_registrationFragment_to_cabinetFragment)
        }
    }

}