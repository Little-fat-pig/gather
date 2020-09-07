package com.innerclass;

public class InnerClass02 {
    //静态内部类
//    private String name="赵六";
    private String pwd="14789";
    private static String nicheng="天天大傻瓜";
    private static String name="是是是";
    public static class Inner{
        String name="王五";
        public void query(){
            System.out.println(InnerClass02.name);
            System.out.println(new InnerClass02().pwd);
            System.out.println(InnerClass02.nicheng);
            System.out.println(name);
        }
    }






    public static void main(String[] args) {
        Inner i=new Inner();
//        InnerClass02 ic=new InnerClass02();
        i.query();

    }


}
