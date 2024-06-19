package com.example.busbooking

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.busbooking.models.ApiResponse
import com.example.busbooking.services.ApiService
import com.google.android.material.textfield.TextInputEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.lang.Error
import kotlin.math.log

class LoginActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // We will get the username and password in this

        val username:EditText=findViewById(R.id.username)
        val password:EditText=findViewById(R.id.password)
        val button:Button=findViewById(R.id.button)

        //Retrofit Instance
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiService = retrofit.create(ApiService::class.java)

        fun fetchData(){
            val call=apiService.getData()
            call.enqueue(object:Callback<ApiResponse>{
                override fun onResponse(requestBody: Call<ApiResponse>, response: Response<ApiResponse>) {
                    if (response.isSuccessful){
                        val body=response.body()
                    }
                }

                override fun onFailure(requestBody: Call<ApiResponse>, error: Throwable) {
                    println(error.message)
                }

            })
        }

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