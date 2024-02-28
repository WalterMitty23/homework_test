package ru.skypro.homework_test.tests_logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceMultiplicationTest extends CalculatorLogicTest {
    @Test
    public void shouldReturnCorrectResultOfMultiplicationTest() {
        assertEquals(2, calculatorService.multiply(1, 2));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenNum1IsNullMultiplicationTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.multiply(null, 2));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenNum2IsNullMultiplicationTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.multiply(1, null));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenBothParamsAreNullMultiplicationTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.multiply(null, null));
    }
}
