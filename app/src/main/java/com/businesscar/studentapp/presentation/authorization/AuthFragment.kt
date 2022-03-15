package com.businesscar.studentapp.presentation.authorization

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.businesscar.studentapp.R
import com.businesscar.studentapp.databinding.AuthFragmentBinding
import com.businesscar.studentapp.presentation.CoreFragment

class AuthFragment : CoreFragment<AuthFragmentBinding, Any>(
    viewBindingInflate = AuthFragmentBinding::inflate,
    AuthViewModel::class.java,
) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.registerButton.setOnClickListener {
            findNavController().navigate(R.id.action_authFragment_to_registrationFragment)
        }
        viewBinding.signInButton.setOnClickListener {
            findNavController().navigate(R.id.action_authFragment_to_cabinetFragment)
        }
    }

    override suspend fun render(state: Any) {}
}