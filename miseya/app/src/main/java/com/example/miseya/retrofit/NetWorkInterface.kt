package com.example.miseya.retrofit

import com.example.miseya.data.Dust
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface NetWorkInterface {
    @GET("getCtprvnRltmMesureDnsty")
    suspend fun getDust(@QueryMap param: HashMap<String, String>): Dust
}