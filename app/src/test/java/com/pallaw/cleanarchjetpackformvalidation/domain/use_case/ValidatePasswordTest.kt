package com.pallaw.cleanarchjetpackformvalidation.domain.use_case

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ValidatePasswordTest{

    private lateinit var validatePassword: ValidatePassword

    @Before
    fun setup(){
        validatePassword = ValidatePassword()
    }

    @Test
    fun `password is not valid when length is less than 8 characters`() {
        val result = validatePassword.execute("abc")

        assertEquals(result.successful, false)
    }

    @Test
    fun `password is not valid when do not contain at least a digit and a character`(){
        val result = validatePassword.execute("aaaaaaaa")

        assertEquals(result.successful, false)
    }
}