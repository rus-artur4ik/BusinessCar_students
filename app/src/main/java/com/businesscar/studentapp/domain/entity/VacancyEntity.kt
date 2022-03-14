package com.businesscar.studentapp.domain.entity

import kotlinx.serialization.Serializable

@Serializable
data class VacancyEntity(
    val companyName: String,
    val positionAtWork: String,
    val brand: String,
    val addressName: String,
    val logoUrl: String
)