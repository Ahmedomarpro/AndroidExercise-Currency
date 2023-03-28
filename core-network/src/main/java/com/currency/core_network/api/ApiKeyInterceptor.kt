package com.currency.core_network.api

import com.currency.core_network.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {

        val request = chain.request().newBuilder()
            .header("apiKey", "Qkf9SEN4Oevez7xh6J2iuLsmc84Q2Qpr")
            .build()

        return  chain.proceed(request)
    }
}