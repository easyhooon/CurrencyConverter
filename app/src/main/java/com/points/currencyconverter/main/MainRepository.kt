package com.points.currencyconverter.main

import com.points.currencyconverter.data.models.CurrencyResponse
import com.points.currencyconverter.util.Resource

interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}