package com.kodilla.parametrized_tests;

import com.sun.jdi.Value;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {
    private UserValidator user = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"b.kuropatwa", "B.Kuropatwa","bKuropatwa", "B-kuro", "Kuro_b", "B.k-u_r0" })
    public void shouldReturnTrueIfUserNameIsCorrect (String username) {
        assertTrue(user.validateUsername(username));
    }
    @ParameterizedTest
    @CsvSource(value = {"B+Kuropatwa", "b&kuro", "BK", "B-(kuropatwa)", "K,Bartek" })
    public void shouldReturnFalseIfUserNameIsIncorrect (String username) {
        assertFalse(user.validateUsername(username));
    }
    @ParameterizedTest
    @CsvSource(value = {"Bart.kuro@gmail.com", "B4rt.Kur0@gmail.com", "B-kuro@asd.jkh", "b1-ku40@gmail.com.pl"})
    public void shouldReturnTrueIfEmailIsCorrect(String email) {
        assertTrue(user.validateEmail(email));
    }
    @ParameterizedTest
    @CsvSource(value = {"bart@kuropatwa.gmail.", "bartek+kuropatwa@gmail.com", "bart.kuro@@gmail.com", "bart.kuro@gmail.", "Bartek-kuro@gmail.123"})
    public void shouldReturnFalseIfEmailIsIncorrect(String email) {
        assertFalse(user.validateEmail(email));
    }

}