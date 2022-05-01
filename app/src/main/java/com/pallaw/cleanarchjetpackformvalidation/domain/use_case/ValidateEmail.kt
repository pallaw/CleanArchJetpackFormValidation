package com.pallaw.cleanarchjetpackformvalidation.domain.use_case

import android.util.Patterns

class ValidateEmail {

    fun execute(email: String): ValidationResult{

        if (email.isBlank()) {
            return ValidationResult(
                successful = false,
                errorMessage = "The email can't be blank"
            )
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return ValidationResult(
                successful = false,
                errorMessage = "Enter a valid email address"
            )
        }

        return ValidationResult(
            successful = true
        )
    }
}