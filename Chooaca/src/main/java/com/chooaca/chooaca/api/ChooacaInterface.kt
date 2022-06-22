package com.chooaca.api

import com.chooaca.model.AutoGempaResponse
import com.chooaca.model.GempaListResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ChooacaInterface {

    /**[AutoGempa]
     * stand for the latest earthquake happened*/
    @GET("DataMKG/TEWS/autogempa.json")
    suspend fun getAutoGempa():Response<AutoGempaResponse>

    /**[GempaList]
     * stand for list of 15 earthquakes that happens recently*/
    @GET("DataMKG/TEWS/gempadirasakan.json")
    suspend fun getGempaList():Response<GempaListResponse>
}