package com.liupai.testng;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class Test05Test {
    private static int a;
    private static int b;
    private static int c;

    @BeforeAll
    static void init(){
        a=10;
        b=10;
        c=4;
    }
    @Test
    public void testcase1(){
        Assertions.assertEquals(400,Test05.V(a,b,c));
     //   System.out.println("resurt = "+Test05.V(a,b,c));

    }

    @Test
    public void testcase2(){
        Assertions.assertEquals(-1,Test05.V(-1,b,c));
    }

    @Test
    public void testcase3(){
        Assertions.assertEquals(-1,Test05.V(0,b,c));
    }

}
