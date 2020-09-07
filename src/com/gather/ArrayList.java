package com.gather;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public void query(){
        //arraylist使用
        List list=new java.util.ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("真七");
        /**
         * 三中集合遍历的方式
         * 1.加强for循环
         * 2.普通for循环
         * 3.迭代器遍历
         * */
        //1.加强for循环
        for (Object item:list){
            System.out.print(item+"@@@");
        }
        System.out.println(list.contains("张三"));
        list.add(5,"假八");

        //2.普通for循环
        for (int i=0;i<list.size();i++){
            System.out.print(i);
        }
        System.out.println(list.get(3));
        int i = list.hashCode();
        System.out.println(i);
        boolean empty = list.isEmpty();
        System.out.println(empty);
        Object remove = list.remove(0);
        System.out.println(remove);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        int size = list.size();
        System.out.println(size);
        boolean remove1 = list.remove("王五");

        System.out.println(remove1);
        for (Object item:
             list) {
            System.out.print(item);
        }
        Object[] objects = list.toArray();
        for (int j = 0; j < objects.length; j++) {
            System.out.println(objects[j]);

        }
        String s = list.toString();
        System.out.println(s);


    }

    public static void main(String[] args) {
        ArrayList ln=new ArrayList();

        ln.query();


    }
}
