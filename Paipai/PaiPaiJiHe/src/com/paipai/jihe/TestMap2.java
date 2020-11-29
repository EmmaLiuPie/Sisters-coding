package com.paipai.jihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMap2 {
    public static void main(String[] args) {
        //1获取所有的key 通过遍历key 获取value
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");

        //get all keys
        Set<Integer> keys= map.keySet();

        Iterator<Integer> it = keys.iterator();

        while(it.hasNext()){
            Integer key =  it.next();
            String value = map.get(key);
            System.out.println(key+"-"+value);
        }
        for (Integer key:keys
             ) {
            System.out.println(key+"-"+map.get(key));

        }

    }

    //2-map转换成set
}
