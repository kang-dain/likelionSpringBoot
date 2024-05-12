package com.example.study.controller.calculator;

import com.example.study.dto.calculator.CalculatorAddRequest;
import com.example.study.dto.calculator.CalculatorMultiplyRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    @GetMapping("/add")
    public int addTwoNumbers(CalculatorAddRequest request)
    {
        return request.getNumber1() + request.getNumber2();
    }

    @PostMapping("/multiply")
    public int multiplyTwoNumbers(@RequestBody CalculatorMultiplyRequest request)
    {
        return request.getNumber1() * request.getNumber2();
    }



}
