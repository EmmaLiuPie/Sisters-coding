package com.paipai.jihe;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");

        System.out.println(map.containsKey(1));//true
        System.out.println(map.containsKey(4));//false
        System.out.println(map.containsValue("zhangsan"));//true
        System.out.println(map.containsValue("emma"));//false
        System.out.println(map.get(1));//zhangsan
        System.out.println(map.isEmpty());//false

        System.out.println(map.put(4,"zhaosi"));//null??????
        map.remove(1);
        System.out.println(map.get(1));//null
        System.out.println(map.size());//3



    }
}
