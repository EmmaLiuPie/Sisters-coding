package com.paipai.implement2;

public class Test {
    public static void main(String[] args) {
        FoodMenu mm=new ChineseCooker();
        Customer cc=new Customer(mm);
        cc.cook();
    }
}
