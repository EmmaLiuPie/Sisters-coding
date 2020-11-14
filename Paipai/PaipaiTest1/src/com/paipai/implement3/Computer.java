package com.paipai.implement3;

public class Computer {
    private String owner;
    InsertDrawable ii;
    Computer(InsertDrawable ii){
        this.ii=ii;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
    public void dodo(){
        ii.doAction();
    }

}
