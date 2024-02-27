package ru.skypro.homework_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
     CalculatorService calculatorService = new CalculatorService();
     @Test
     void testPlus() {
          assertEquals(3, calculatorService.plus(1, 2));
          assertEquals(1, calculatorService.plus(-1, 2));
          assertEquals(-1, calculatorService.plus(1, -2));
          assertEquals(-3, calculatorService.plus(-1, -2));
          assertEquals(2, calculatorService.plus(0, 2));
             }

     @Test
     void testMinus() {
          assertEquals(-1, calculatorService.minus(1, 2));
          assertEquals(-3, calculatorService.minus(-1, 2));
          assertEquals(3, calculatorService.minus(1, -2));
          assertEquals(1, calculatorService.minus(-1, -2));
          assertEquals(-2, calculatorService.minus(0, 2));

     }

     @Test
     void testMultiply() {
          assertEquals(2, calculatorService.multiply(1, 2));
          assertEquals(-2, calculatorService.multiply(-1, 2));
          assertEquals(-2, calculatorService.multiply(1, -2));
          assertEquals(2, calculatorService.multiply(-1, -2));
          assertEquals(0, calculatorService.multiply(0, 2));

     }

     @Test
     void testDivide() {
          assertEquals(0, calculatorService.divide(1, 2));
          assertEquals(-2, calculatorService.divide(-1, 2));
          assertEquals(-2, calculatorService.divide(1, -2));
          assertEquals(2, calculatorService.divide(-1, -2));
          assertEquals(0, calculatorService.divide(0, 2));

          assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(1, 0));

//          assertThrows(IllegalArgumentException.class, new Executable() {
//               @Override
//               public void execute() throws Throwable {
//                    calculatorService.divide(1, 0);
//               }
//          });

     }

}