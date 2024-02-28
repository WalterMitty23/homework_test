package ru.skypro.homework_test;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public Integer plus(Integer num1, Integer num2) {
        checkForNull(num1, num2);
        return num1 + num2;
    }

    public Integer minus(Integer num1, Integer num2) {
        checkForNull(num1, num2);
        return num1 - num2;
    }

    public Integer multiply(Integer num1, Integer num2) {
        checkForNull(num1, num2);
        return num1 * num2;
    }

    public Integer divide(Integer num1, Integer num2) {
        checkForNull(num1, num2);
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на ноль запрещено!");
        }
        return num1 / num2;
    }

    private void checkForNull(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NullPointerException("нооль");
        }
    }

}
