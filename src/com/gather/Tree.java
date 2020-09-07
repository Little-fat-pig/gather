package com.gather;

import java.util.TreeSet;

public class Tree {
    public void query(){
        TreeSet<Integer> s=new TreeSet<Integer>();
        s.add(1);
        s.add(8);
        s.add(3);
        s.add(9);
        s.add(2);
        s.add(5);

//        s.add("张三");
//        s.add("李四");
//        s.add("王五");
//        s.add("赵六");
//        s.add("真七");
       // s.add("赵六");
        for (Object item:
             s) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Tree t=new Tree();
        t.query();
    }
}
