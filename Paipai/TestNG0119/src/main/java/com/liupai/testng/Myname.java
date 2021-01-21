package com.liupai.testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Myname {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;
    @BeforeMethod
    public void f1(){
        System.out.println("beforemethod");
    }
    @AfterMethod
    public void f2(){
        System.out.println("aftermethod");
    }
    @Test
    public void f(){
        System.out.println("test");
        Assert.assertTrue(true);
    }

//数据驱动
    @Test(dataProvider = "data")
    public void f3(String name,String sister){
        System.out.println("name="+name);
        System.out.println("sister="+sister);
    }

    @DataProvider(name="data")
    public Object[][] dataprovide1(){
        return new Object[][]{
                new Object[]{"liupai","wangdan"},
                new Object[]{"liupai1","wangdan1"}

        };
    }








}
