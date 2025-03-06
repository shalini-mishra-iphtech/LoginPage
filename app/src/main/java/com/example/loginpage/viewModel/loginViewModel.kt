package com.example.loginpage.viewModel

import androidx.lifecycle.ViewModel
import com.example.loginpage.MainActivity
import com.example.loginpage.fragment.ForgetPasswordFragment
import com.example.loginpage.fragment.HomeFragment
import com.example.loginpage.fragment.RegisterFragment

class LoginViewModel : ViewModel() {

    fun goToHome(activity: MainActivity) {
        activity.loadFragment(HomeFragment()) // Directly call loadFragment()
    }

    fun goToRegister(activity: MainActivity) {
        activity.loadFragment(RegisterFragment())
    }

    fun goToForgetPassword(activity: MainActivity) {
        activity.loadFragment(ForgetPasswordFragment())
    }

}
