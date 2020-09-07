package com.gather;

import java.util.LinkedHashSet;

public class LinkSet {
    public void query(){
        LinkedHashSet<String> s=new LinkedHashSet<>();
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

    }

    public static void main(String[] args) {
        LinkSet ls=new LinkSet();
        ls.query();
    }
}
