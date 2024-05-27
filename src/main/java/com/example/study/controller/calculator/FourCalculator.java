package com.example.study.controller.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FourCalculator {

    @GetMapping("/calc")
    public CalculationResult calculate(@RequestParam int num1, @RequestParam int num2) {
        int add = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int division = num1 / num2;

        return new CalculationResult(add, minus, multiply, division);
    }

    public static class CalculationResult {
        private final int add;
        private final int minus;
        private final int multiply;
        private final int division;

        public CalculationResult(int add, int minus, int multiply, int division) {
            this.add = add;
            this.minus = minus;
            this.multiply = multiply;
            this.division = division;
        }

        public int getAdd() {
            return add;
        }

        public int getMinus() {
            return minus;
        }

        public int getMultiply() {
            return multiply;
        }

        public int getDivision() {
            return division;
        }
    }
}
