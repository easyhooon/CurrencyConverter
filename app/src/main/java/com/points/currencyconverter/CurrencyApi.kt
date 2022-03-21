package com.points.currencyconverter

import com.points.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("latest?access_key=${BuildConfig.API_KEY}")
    suspend fun getRates(
        @Query("base") base: String
    ): Response<CurrencyResponse>
}