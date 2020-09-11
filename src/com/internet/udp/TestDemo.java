package com.internet.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class TestDemo {
    //udp通信
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DatagramSocket ds=new DatagramSocket();
        Class.forName("TestDemo");


//        System.out.println("请输入发送内容：");
//        Scanner sc=new Scanner(System.in);
//        String s=null;
        while (true){


        String msg="hello world！";
        byte[] bytes=msg.getBytes();
//        byte[] bytes=s.getBytes();
        //建立发送数据包
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),2020);

            ds.send(dp);
            ds.close();
        }


    }
}
