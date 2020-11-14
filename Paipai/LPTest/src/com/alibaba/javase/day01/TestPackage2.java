package com.alibaba.javase.day01;
import com.alibaba.javase.day02.*;


public class TestPackage2 {
    public static void main(String[] args){
        TestPackage t = new TestPackage();
        t.funPrint();
        TestPackage.funPrint2();
        TestPackage3.printp();
    }
}
