package com.alibaba.javase.day16;

public class Vehicle {
    private double speed;
    public int size;
    Vehicle(int speed,int size){
        this.size=size;
        this.speed=speed;
        System.out.println("size is "+size+" ,speed is "+speed);
    }

    public  void  move(){
        System.out.println("move");
    }

    public void setSpeed(double speed) {
        this.speed = speed;
        System.out.println("now speed is "+this.speed);
    }
    public void speedUp(){
        this.speed=this.speed+1;
       System.out.println("now speed is "+this.speed);


    }

}
