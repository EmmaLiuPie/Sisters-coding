package com.paipai.implement2;

public class Customer {
    FoodMenu mm;
    Customer(){

    }
    Customer(FoodMenu mm){
        this.mm=mm;
    }

    public void cook(){
        mm.fish();
    }
}
