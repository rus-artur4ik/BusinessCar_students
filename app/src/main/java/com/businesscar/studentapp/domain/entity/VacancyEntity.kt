package com.businesscar.studentapp.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class VacancyEntity(
    val companyName: String,
    val positionAtWork: String,
    val brand: String,
    val addressName: String,
    val logoUrl: String
) : Parcelable