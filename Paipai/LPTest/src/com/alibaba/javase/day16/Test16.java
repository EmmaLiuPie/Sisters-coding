package com.alibaba.javase.day16;

public class Test16 {
    public static void main(String[] args) {
        Vehicle v=new Vehicle(10,20);
        v.move();
        v.speedUp();
        v.setSpeed(40);


        Number n=new Number(8,4);

        System.out.println(n.addition());
        System.out.println(n.division());
        System.out.println(n.multiplication());
        System.out.println(n.subtration());

        Person p=new Person(10,"Ann");
        p.display();
        p.setAge(9);
        p.setName("Bee");
        p.display();

        MyTime m = new MyTime(23,59,59);
        m.display();
        m.addSecond();
     //   m.addMinute();
     //   m.addHout();
        m.display();

    }
}
