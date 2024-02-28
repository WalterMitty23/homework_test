package ru.skypro.homework_test.tests_logic;
import org.junit.jupiter.api.BeforeEach;
import ru.skypro.homework_test.CalculatorService;


public class CalculatorLogicTest {
    protected CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }
}

