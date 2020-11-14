package com.alibaba.javase.day02;

public class TestSuper {
     public static void main(String[] args){
         new B();
     }
}
class A{

    public A(int i){
        System.out.println("A 有参构造方法");
    }
}

class B extends A{
    public B(){
        super(40);
        System.out.println("B 无参构造方法");
    }



}
