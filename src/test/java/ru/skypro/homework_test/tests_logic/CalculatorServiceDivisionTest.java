package ru.skypro.homework_test.tests_logic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceDivisionTest extends CalculatorLogicTest {
    @Test
    public void shouldReturnCorrectResultOfDivisionTest() {
        assertEquals(0, calculatorService.divide(1, 2));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenNum1IsNullDivisionTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.divide(null, 2));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenNum2IsNullDivisionTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.divide(1, null));
    }

    @Test
    public void shouldThrowRuntimeExceptionWhenBothParamsAreNullDivisionTest() {
        assertThrows(RuntimeException.class, () -> calculatorService.divide(null, null));
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivideByZeroTest() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(1, 0));
    }
}
