package com.alibaba.javase.day16;

public class Person {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    Person(){}

    public void display(){
        System.out.println(this.age+this.name);
    }
}
