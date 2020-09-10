package com.IO;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.io.*;

public class Filecopy2 {
    public void query(){
        //增加存在流的功能，增加原文件的行数，读取一个int的数字（一次性的）。推送字节到系统内存
        FilterInputStream fis=null;
        FilterOutputStream fos=null;
        File f=new File("C:\\Users\\EDZ\\Desktop\\出师表.txt");
        File old=new File("fff");
        try {
            InputStream is=new FileInputStream(f);
            RandomAccessFile randomAccessFile=new RandomAccessFile(f,"rw");
            byte [] bytes=new byte[3];
            bytes[0]=1;
            bytes[1]=2;
            randomAccessFile.write(bytes);
            System.out.println(randomAccessFile.length());

            //推送字节到系统
            fis=new PushbackInputStream(is);
            //filter增加源文件行数的
            fis=new LineInputStream(is);
            //读取一个int、double、string；一次性的
            fis=new DataInputStream(is);
            byte [] b=new byte[1024];
            StringBuffer sb=new StringBuffer();
            int s;
            while ((s=fis.read(b))>0){
                sb.append(s);

            }
            System.out.println(sb);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Filecopy2 fc=new Filecopy2();
        fc.query();
    }
}
