package com.mirkamol.signinandsignupui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.mirkamol.signinandsignupui.R

class SignUpActivity : AppCompatActivity() {
    lateinit var fullName:EditText
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var etCpassword:EditText
    lateinit var bSignUp: TextView
    lateinit var tvSignIn: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        initViews()

    }



    private fun initViews() {
        fullName = findViewById(R.id.et_fullname)
        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)
        etCpassword = findViewById(R.id.et_cpassword)
        bSignUp = findViewById(R.id.b_signup)
        tvSignIn = findViewById(R.id.tv_signin)

        bSignUp.setOnClickListener {
           finish()
        }
        tvSignIn.setOnClickListener {
            finish()
        }

    }
}