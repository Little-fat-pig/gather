package com.innerclass;

public class InnerClass03 {
    //局部内部类
    public void query(){
        final int a=25;
        int b=23;
        class Inner{
            int c=20;
            public void query(){
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
        }
        Inner i=new Inner();
        i.query();
    }




    public static void main(String[] args) {
        InnerClass03 ic=new InnerClass03();
        ic.query();


    }


}
