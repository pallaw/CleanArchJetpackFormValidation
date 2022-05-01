package com.pallaw.cleanarchjetpackformvalidation.presentation

sealed class RegistrationFormEvent {

    data class EmailChanged(val email: String) : RegistrationFormEvent()
    data class PasswordChanged(val password: String) : RegistrationFormEvent()
    data class RepeatedPasswordChanged(val repeatedPassword: String) : RegistrationFormEvent()
    data class AcceptTerms(val accepted: Boolean) : RegistrationFormEvent()

    object Submits: RegistrationFormEvent()
}
