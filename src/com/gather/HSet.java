package com.gather;

import java.util.HashSet;
import java.util.Set;

public class HSet {
    public void query(){
        Set<String> s=new HashSet<>();
        s.add("张三");
        s.add("李四");
        s.add("王五");
        s.add("赵六");
        s.add("真七");
        s.add("赵六");
        for (Object item:
             s) {
            System.out.println(item);
        }
        Object[] objects = s.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i]+"  ");
        }
        String s1 = s.toString();
        System.out.println(s1);


    }

    public static void main(String[] args) {
        HSet hs=new HSet();
        hs.query();

    }
}
