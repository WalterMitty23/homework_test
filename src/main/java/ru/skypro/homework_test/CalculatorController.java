package ru.skypro.homework_test;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/")
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public ResponseEntity<String> plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа");
        }
        int result = calculatorService.plus(num1, num2);
            return ResponseEntity.ok(num1 + " + " + num2 + " = " + result);
    }
    @GetMapping(path = "/minus")
            public ResponseEntity<String> minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа");
        }
        int result = calculatorService.minus(num1, num2);
            return ResponseEntity.ok(num1 + " - " + num2 + " = " + result);
    }

    @GetMapping("/multiplication")
            public ResponseEntity<String> multiplication(@RequestParam("num1") Integer num1, @RequestParam("num2") Integer num2) {
        if (num1 == null || num2 == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: необходимо указать оба числа");
        }
        int result = calculatorService.multiply(num1, num2);
            return ResponseEntity.ok(num1 + " * " + num2 + " = " + result);
        }

    @GetMapping(path = "/divide")
            public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
            if (num1 == null || num2 == null) {
                return "Введите число";
            } else if (num2 == 0) {
                return "На ноль делить нельзя";
            }
            int result = calculatorService.divide(num1, num2);
                return num1 + " / " + num2 + " = " + result;
            }



}
