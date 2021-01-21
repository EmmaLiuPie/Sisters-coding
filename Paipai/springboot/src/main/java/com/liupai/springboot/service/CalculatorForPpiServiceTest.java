package com.liupai.springboot.service;

import com.liupai.springboot.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//业务逻辑层的单元自动化测试用例
@SpringBootTest(classes={Application.class})
public class CalculatorForPpiServiceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private CalculatorForPpiService service;
    private int a;
    private int b;
    private int c;

    @BeforeClass
    public void init(){
        a=10;
        b=10;
        c=10;
    }
    @Test
    public void testCase1(){
        Assert.assertEquals(1000,service.calculate(a,b,c));
    }

}
