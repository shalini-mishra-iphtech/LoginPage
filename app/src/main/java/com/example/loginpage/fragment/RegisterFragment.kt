package com.example.loginpage.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.loginpage.MainActivity
import com.example.loginpage.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"



class RegisterFragment : Fragment() {

lateinit var LoginBtn:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view= inflater.inflate(R.layout.fragment_register, container, false)

        initView(view)

        return view


    }

    fun initView(view:View){
    LoginBtn=view.findViewById(R.id.loginIn)
    LoginBtn.setOnClickListener{
        (activity as? MainActivity)?.loadFragment(LoginFragment())
    }
}


}