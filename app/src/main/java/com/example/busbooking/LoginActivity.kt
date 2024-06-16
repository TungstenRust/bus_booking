package com.example.busbooking

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.google.android.material.textfield.TextInputEditText
import kotlin.math.log

class LoginActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // We will get the username and password in this

        val username:EditText=findViewById(R.id.username)
        val password:EditText=findViewById(R.id.password)
        val button:Button=findViewById(R.id.button)

        fun handleLogin(){
            println("button clicked")

            // We will make an api call here
            Toast.makeText(this,"Login Initiated",Toast.LENGTH_SHORT).show()

        }

        button.setOnClickListener{
            handleLogin()
        }
    }
}