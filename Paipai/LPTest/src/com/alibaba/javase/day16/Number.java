package com.alibaba.javase.day16;

public class Number {
    private int n1;
    private int n2;

    Number(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }
    Number(){

    }
    public int addition(){
        return this.n1+this.n2;
    }
    public int subtration(){
        return this.n1-this.n2;
    }
    public int multiplication(){
        return this.n1*this.n2;
    }
    public double division(){
        return this.n1/this.n2;
    }
}
