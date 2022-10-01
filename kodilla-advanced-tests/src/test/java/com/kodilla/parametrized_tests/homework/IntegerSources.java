package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class IntegerSources {
    static Stream<Arguments> provideIntegerForTestingBMI() {
        return Stream.of(
                Arguments.of(1.78, 85 ,"Overweight"),
                Arguments.of(1.70, 100,"Obese Class I (Moderately obese)"),
                Arguments.of(1.88, 170, "Obese Class IV (Morbidly Obese)")

        );
    }
}
