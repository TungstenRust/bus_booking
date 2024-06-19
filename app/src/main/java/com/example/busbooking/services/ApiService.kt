package com.example.busbooking.services

import com.example.busbooking.models.ApiResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/todos")
    fun getData():Call<ApiResponse>
}