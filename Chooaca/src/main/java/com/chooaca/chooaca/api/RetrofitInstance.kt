package com.chooaca.api

import com.chooaca.util.ApiUtil.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit =
        Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val chooacaApi =
        retrofit
            .create(ChooacaInterface::class.java)
}