package com.example.loginpage

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.loginpage.fragment.LoginFragment
import android.widget.Toast


import androidx.activity.viewModels
import com.example.loginpage.fragment.ForgetPasswordFragment
import com.example.loginpage.fragment.HomeFragment
import com.example.loginpage.fragment.RegisterFragment
import com.example.loginpage.viewModel.LoginViewModel

class MainActivity : AppCompatActivity() {

    private var backPressedTime: Long = 0
 //   private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //call the login fragment
       loadFragment(LoginFragment())

    }

    //loading the fragment
   fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.login_container ,fragment)  // add fragment_container is in activity_main.xml
            .addToBackStack(null)
            .commit()
    }
    //handling backpressed
override fun onBackPressed() {
    val currentFragment = supportFragmentManager.findFragmentById(R.id.login_container)

    if (currentFragment is LoginFragment) {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            finish()
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
            backPressedTime = System.currentTimeMillis()
        }
    } else {
        super.onBackPressed()
    }
}



}




