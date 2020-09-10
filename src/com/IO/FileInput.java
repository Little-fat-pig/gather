package com.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInput {
    public void  query() throws IOException {
        //获取句柄
        File f=new File("C:\\Users\\EDZ\\Desktop\\滕王阁序.txt","utf8");
       //判断文件是否存在，不存在则在当前路径下新建
////        boolean newFile = f.createNewFile();
//        File absoluteFile = f.getAbsoluteFile();
//        System.out.println(absoluteFile);
//        String absolutePath = f.getAbsolutePath();
//        System.out.println(absolutePath);
//        File canonicalFile = f.getCanonicalFile();
//        System.out.println(canonicalFile);
//        System.out.println(f.getParent());
//        System.out.println(f.getParentFile());
//        System.out.println(f.isDirectory());
//        System.out.println(f.lastModified());
//        System.out.println(f.length());
//        System.out.println(f.list());
//        boolean mkdir = f.mkdir();
//        System.out.println(mkdir);
//        String s = f.toString();
//        System.out.println(s);
//        System.out.println("======================");
        InputStream is=new FileInputStream(f);
        byte [] b=new byte[4096];
        int read = is.read(b);
        is.close();
        System.out.println(new String(b,0,read));




//        boolean delete = f.delete();
//        System.out.println(delete);
    }
    public static void main(String[] args) throws IOException {
        FileInput fi=new FileInput();
        fi.query();

    }
}
