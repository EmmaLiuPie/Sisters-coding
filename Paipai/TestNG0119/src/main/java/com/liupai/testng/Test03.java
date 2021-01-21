package com.liupai.testng;

import org.testng.annotations.Test;

public class Test03 {
    @Test(groups = "group1")
    public void testCase1(){
        System.out.println("Testcase1");
    }
    @Test
    public void testCase2(){
        System.out.println("Testcase2");
    }
    @Test(groups = "group1")
    public void testCase3(){
        System.out.println("Testcase3");
    }
    @Test
    public void testCase4(){
        System.out.println("Testcase4");
    }
    @Test
    public void testCase5(){
        System.out.println("Testcase5");
    }
}
