package com.paipai.jihe;
import java.util.*;

public class TestCollection {
    public static void main(String[] args) {
        /*
        Collection c_HashSet = new HashSet();
        c_HashSet.add("123");
        c_HashSet.add(456);
        c_HashSet.add(456);

        Iterator it_hashSet = c_HashSet.iterator();

        while(it_hashSet.hasNext()){
            Object obj_HashSet = it_hashSet.next();
            System.out.println(obj_HashSet);
        }

        Collection c_ArrayList = new ArrayList();
        c_ArrayList.add("123");
        c_ArrayList.add(456);
        c_ArrayList.add(789);

        Iterator it_ArrayList = c_ArrayList.iterator();

        while(it_ArrayList.hasNext()){
            Object obj_ArrayList = it_ArrayList.next();
            System.out.println(obj_ArrayList);
        }
        System.out.println(c_ArrayList.size());
        System.out.println(c_ArrayList.contains(789));
        System.out.println(c_ArrayList.contains("789"));

        c_ArrayList.clear();
        System.out.println(c_ArrayList.size());

      */  Collection c_LinkerList = new LinkedList();
        c_LinkerList.add(1);
        c_LinkerList.add(2);
        c_LinkerList.add(3);
        c_LinkerList.add("student");



        ((LinkedList) c_LinkerList).add(1,"teacher");
        int i = 0;
        for(i = 0;i<c_LinkerList.size();i++){
            System.out.println(((LinkedList) c_LinkerList).get(i));
        }
        System.out.println(((LinkedList) c_LinkerList).indexOf(1));
        ((LinkedList) c_LinkerList).remove(2);
        for(i = 0;i<c_LinkerList.size();i++){
            System.out.println(((LinkedList) c_LinkerList).get(i));
        }


    }



}

