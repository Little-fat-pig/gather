package com.gather;

import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

public class TreeHash {
    public void query(){
        TreeMap<Integer,String> lhm=new TreeMap();
        lhm.put(1,"z");
        lhm.put(2,"a");
        lhm.put(3,"g");
        lhm.put(4,"e");
        lhm.put(5,"y");
        for (Integer item:lhm.keySet()){
            System.out.println(item+":"+lhm.get(item));
        }
        for (Map.Entry<Integer,String> entry:lhm.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key+":"+value);
        }

    }

    public static void main(String[] args) {
        TreeHash th=new TreeHash();
        th.query();
        Properties p=System.getProperties();
        p.list(System.out);
        System.out.println(p);
    }
}
