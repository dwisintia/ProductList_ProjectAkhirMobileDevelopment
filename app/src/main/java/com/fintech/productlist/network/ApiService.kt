package com.fintech.productlist.network

import com.fintech.productlist.model.Product
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("products")
    fun getProduct(): Call<List<Product>>
}