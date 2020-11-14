package com.paipai.implement3;

import java.util.concurrent.Callable;

public class Test {
    public static void main(String[] args) {
        InsertDrawable ii=new Display();
        Computer cc=new Computer(ii);

        cc.dodo();
    }
}
