package ru.skypro.homework_test.tests_logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceSubtractionTest extends CalculatorLogicTest {
    @Test
    public void shouldReturnCorrectResultOfSubtractionTest() {
        assertEquals(-1, calculatorService.minus(1, 2));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenNum1IsNullSubtractionTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.minus(null, 2));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenNum2IsNullSubtractionTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.minus(1, null));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenBothParamsAreNullSubtractionTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.minus(null, null));
    }

}
