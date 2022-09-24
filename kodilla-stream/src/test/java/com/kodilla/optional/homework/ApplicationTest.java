package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {
    @Test
    public void  shouldReturnCorrectTeacherName() {
        Teacher romanZielony = new Teacher("Roman Zielony");
        Student pawel = new Student("Pawel",romanZielony);
        assertEquals("Roman Zielony",Application.getTeacherName(pawel));
    }

    @Test
    public void shouldReturnOptionalWhenNull() {
        Student bartek =new Student("Bartek", null);
        assertEquals("<undefined>",Application.getTeacherName(bartek));
    }



}