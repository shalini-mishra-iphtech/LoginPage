package com.example.loginpage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.loginpage.MainActivity

import com.example.loginpage.R
import com.example.loginpage.viewModel.LoginViewModel


class LoginFragment : Fragment() {

   lateinit var registerBtn: TextView
   lateinit var forgetPasswordBtn:TextView
   lateinit var homeFragment: Button


    private val loginViewModel = LoginViewModel()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_login, container, false)
        initView(view)
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        registerBtn = view.findViewById(R.id.register)
        forgetPasswordBtn = view.findViewById(R.id.textView4)
        homeFragment = view.findViewById(R.id.login)

        registerBtn.setOnClickListener {
            loginViewModel.goToRegister(requireActivity() as MainActivity)
        }

        forgetPasswordBtn.setOnClickListener {
            loginViewModel.goToForgetPassword(requireActivity() as MainActivity)
        }

        homeFragment.setOnClickListener {
            loginViewModel.goToHome(requireActivity() as MainActivity)
        }
    }


    fun initView(view: View){
        /*
        registerBtn = view.findViewById(R.id.register)
        registerBtn.setOnClickListener{
            (activity as? MainActivity)?.loadFragment(RegisterFragment())
        }
        */

        /*
        forgetPasswordBtn=view.findViewById(R.id.textView4)
        forgetPasswordBtn.setOnClickListener{
            (activity as? MainActivity)?.loadFragment(ForgetPasswordFragment())
        }
        */

        /*
        homeFragment=view.findViewById(R.id.login)
        homeFragment.setOnClickListener{
            (activity as? MainActivity)?.loadFragment(HomeFragment())
        }
        */

    }


}


