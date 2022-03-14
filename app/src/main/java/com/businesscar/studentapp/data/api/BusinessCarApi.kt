package com.businesscar.studentapp.data.api

import com.businesscar.studentapp.domain.entity.VacancyEntity
import retrofit2.Call
import retrofit2.http.GET

interface BusinessCarApi {

    @GET("marvel")
    fun getMovieList(): Call<MutableList<VacancyEntity>>
}