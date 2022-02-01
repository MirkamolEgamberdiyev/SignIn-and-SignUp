package com.mirkamol.signinandsignupui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.mirkamol.signinandsignupui.R

class SignInActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var bSignin: TextView
    lateinit var tvSignup: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initViews()

    }

    private fun initViews() {
        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)
        bSignin = findViewById(R.id.b_signin)
        tvSignup = findViewById(R.id.tv_signup)

        bSignin.setOnClickListener {
            callSingHomeActivity()
        }
        tvSignup.setOnClickListener {
            callSingUpActivity()
        }

    }


    fun callSingUpActivity() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    fun callSingHomeActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }


}