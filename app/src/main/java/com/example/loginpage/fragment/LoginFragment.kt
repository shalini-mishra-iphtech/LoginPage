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

class LoginFragment : Fragment() {

   lateinit var registerBtn: TextView
   lateinit var forgetPasswordBtn:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_login, container, false)

        initView(view)
        return view
    }

    fun initView(view: View){
        registerBtn = view.findViewById(R.id.register)
        registerBtn.setOnClickListener{
            (activity as? MainActivity)?.loadFragment(RegisterFragment())
        }
        forgetPasswordBtn=view.findViewById(R.id.textView4)
        forgetPasswordBtn.setOnClickListener{
            (activity as? MainActivity)?.loadFragment(ForgetPasswordFragment())
        }
    }


}