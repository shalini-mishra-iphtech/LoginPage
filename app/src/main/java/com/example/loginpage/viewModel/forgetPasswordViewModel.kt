package com.example.loginpage.viewModel



import androidx.lifecycle.ViewModel
import com.example.loginpage.MainActivity
import com.example.loginpage.fragment.HomeFragment

class ForgetPasswordViewModel : ViewModel() {
    // Add any ForgetPasswordFragment-related
    fun goToHome(activity: MainActivity) {
        activity.loadFragment(HomeFragment()) // Directly call loadFragment()
    }

}
