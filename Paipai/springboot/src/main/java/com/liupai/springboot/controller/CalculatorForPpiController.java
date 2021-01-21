package com.liupai.springboot.controller;

import com.liupai.springboot.service.CalculatorForPpiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CalculatorForPpiController {
    @Resource
    private CalculatorForPpiService calculatorForPpiService;

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("a") int a,@RequestParam("b") int b,@RequestParam("c") int c){
        long result = calculatorForPpiService.calculate(a,b,c);
        return "{\"PPI\":"+result+"}";
    }
}
