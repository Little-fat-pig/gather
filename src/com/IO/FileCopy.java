package com.IO;

import java.io.*;

public class FileCopy {
    public static void query(String old,String n,int size) throws FileNotFoundException {
        InputStream in=null;
        OutputStream out=null;
        File f=new File(old);

        File ns=new File(n);
        try {
            in=new FileInputStream(f);
            out=new FileOutputStream(ns);
            byte [] bytes=new byte[size];
            int len;
            while ((len=in.read(bytes))>0){
                out.write(bytes,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        int []arr={1,8,6,6,5,96,6,8,662,7,3,9};
//        for (int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//追加内容的方法式
        String s="没怕过后羿！";
        File f1=new File("C:\\Users\\EDZ\\Desktop\\出师表.txt");
        FileWriter fileWriter=null;

        try {
            fileWriter=new FileWriter(f1,true);

            PrintWriter pw=new PrintWriter(fileWriter);
            pw.print(s);
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public static void main(String[] args) throws FileNotFoundException {
        FileCopy.query("C:\\Users\\EDZ\\Desktop\\出师表.txt","C:\\Users\\EDZ\\Desktop\\滕王阁序.txt",2048);
    }
}
