package com.liupai.testng;

import org.testng.annotations.Test;

public class Test02 {
    @Test(description = "TestCase111111111111111")
    public void testCase1(){
        System.out.println("Testcase1");
    }
    @Test(priority = 2)
    public void testCase2(){
        System.out.println("Testcase2");
    }
    @Test(priority = 1)
    public void testCase3(){
        System.out.println("Testcase3");
    }
    @Test
    public void testCase4(){
        System.out.println("Testcase4");
        throw new RuntimeException("testcase4运行异常");
    }
    @Test(groups = "myGroup")
    public void testCase5(){
        System.out.println("Testcase5");
        throw new RuntimeException("testcase5运行异常");
    }
    @Test(enabled = false)
    public void testCase6(){
        System.out.println("Testcase6");
    }
    @Test(dependsOnMethods = {"testCase4"},dependsOnGroups = {"myGroup"},alwaysRun = true)
    public void testCase7(){
        System.out.println("Testcase7");
    }
}
