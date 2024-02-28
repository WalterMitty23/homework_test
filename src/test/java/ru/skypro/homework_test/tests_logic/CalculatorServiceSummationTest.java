package ru.skypro.homework_test.tests_logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceSummationTest extends CalculatorLogicTest {
    @Test
    public void shouldReturnCorrectResultOfSummationTest() {
        assertEquals(3, calculatorService.plus(1, 2));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenNum1IsNullSummationTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.plus(null, 2));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenNum2IsNullSummationTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.plus(1, null));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenBothParamsAreNullSummationTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.plus(null, null));
    }
}
