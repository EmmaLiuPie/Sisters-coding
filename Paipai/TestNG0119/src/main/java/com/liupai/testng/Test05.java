package com.liupai.testng;

public class Test05 {
    public static int V(int a,int b,int c)
    {
        int result;
        if(a>0&&b>0&&c>0){
            result = a*b*c;
        }
        else{
            result=-1;
        }
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        return result;
    }
}
