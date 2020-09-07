package com.innerclass;

public class InnerClass01 {
    //成员内部类
    private String name="张三";
    private String pwd="123456";
    public class Inner{
        String name="李四";
        public void query(){
            System.out.println(InnerClass01.this.name);
            System.out.println(name);
            System.out.println(pwd);
        }
        public Inner getInnerClass(){
            Inner i=new Inner();
            return i;
        }
    }
    public static void main(String[] args) {
        InnerClass01 ic=new InnerClass01();
        //成员内部类   创建内部类对象的格式
        Inner inner = ic.new Inner();
        inner.query();


    }


}
