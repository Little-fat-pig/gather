package com.gather;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hash {
    /**
     * map集合的三种遍历
     * 1.普通for循环（返回键和值）
     * 2.迭代器遍历
     * 3.for循环通过键找值
     *
     * */
    public void query() {
        HashMap<Integer, Integer> hashMap = new HashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 1);
        hashMap.put(3, 1);
        hashMap.put(4, 1);
        hashMap.put(5, 1);
        //找键和值
        for (int i = 0; i < hashMap.size(); i++) {
            Object o = hashMap.get(i);
            System.out.println(i + ":" + o);
        }
        //迭代器找 值
        Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println("迭代器遍历");
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }
        //遍历map集合
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":" + value);
        }


        //把键值放到一个set集合中，因为set集合不允许重复
        for (Integer s : hashMap.keySet()) {
            System.out.print(s);
        }
        for (Integer s : hashMap.values()) {
            System.out.print(s);
        }
    }
    public static void main(String[] args) {
        Hash h=new Hash();
        h.query();
    }
}
