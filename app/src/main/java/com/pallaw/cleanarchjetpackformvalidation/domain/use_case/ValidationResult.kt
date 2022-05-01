package com.pallaw.cleanarchjetpackformvalidation.domain.use_case

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)
