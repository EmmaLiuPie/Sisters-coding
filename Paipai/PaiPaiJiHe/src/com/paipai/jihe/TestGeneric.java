package com.paipai.jihe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGeneric {
    public static void main(String[] args) {
        List mylist = new ArrayList();
        Cat cat = new Cat();
        mylist.add(cat);
        Iterator it = mylist.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            Animal a = (Animal)obj;
            a.move();
        }

        List<Animal> mylistnew = new ArrayList<Animal>();
        mylistnew.add(cat);
        Iterator itnew = mylistnew.iterator();



        while(itnew.hasNext()){
            Animal anew = (Animal) itnew.next();
            anew.move();
        }

    }
}

class Animal{
    public void move(){
        System.out.println("animal move");
    }
}

class Cat extends Animal{

}