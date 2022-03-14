package com.businesscar.studentapp.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit

@ExperimentalSerializationApi
object RetrofitClient {
    private var retrofit: Retrofit? = null


    fun getClient(baseUrl: String): Retrofit {
        if (retrofit == null) {
            val contentType = MediaType.get("application/json")

            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(Json.asConverterFactory(contentType))
                .build()
        }
        return retrofit!!
    }
}