package com.liupai.springboot.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorForPpiService {
    public long calculate(int a,int b,int c){
        int result;
        if(a>0 &&b>0&&c>0){
            result=a*b*c;
        }
        else {
            result=-1;
        }
        return result;
    }
}
