package com.IO;

import java.io.*;
import java.nio.channels.FileChannel;

public class FileCopy1 {
    //FileChannel复制文件内容非常快
    public static void query(String old,String news){
        FileChannel in=null;
        FileChannel out=null;
        //源文件目录
        File f=new File(old);
        //目标文件目录
        File file=new File(news);
        try {
            in=new FileInputStream(f).getChannel();
            out=new FileOutputStream(file).getChannel();
            out.transferFrom(in,0,in.size());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {


            out.close();
            in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        FileCopy1.query("C:\\Users\\EDZ\\Desktop\\出师表.txt","C:\\Users\\EDZ\\Desktop\\滕王阁序.txt");
    }
}
