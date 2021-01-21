package com.liupai.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test04 {
    @Parameters({"para"})
    @Test
    public void Testcase1(String para){
        System.out.println(para);
    }
}
