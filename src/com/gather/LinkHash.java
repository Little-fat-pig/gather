package com.gather;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHash {
    public void query(){
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap();
        lhm.put(1,"张三");
        lhm.put(2,"李四");
        lhm.put(3,"王五");
        lhm.put(4,"赵六");
        lhm.put(5,"真七");
        Iterator<Map.Entry<Integer,String> > iterator = lhm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }
        for (Map.Entry<Integer,String> entry:lhm.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key+":"+value);
        }
        System.out.println();
        for (Integer item:lhm.keySet()) {

            System.out.println(item+lhm.get(item));
        }


    }

    public static void main(String[] args) {
        LinkHash lh=new LinkHash();
        lh.query();
    }
}
