package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        Scanner scanner=new Scanner(System.in);
        //服务端（接收方）的端口
        DatagramSocket ds=new DatagramSocket(8886);
        System.out.println("服务端已经启动！");
        while(true) {
            //准备收数据
            byte[] b=new byte[1024];
            DatagramPacket dp=new DatagramPacket(b, b.length);
            //开始收  收到的是字节数组
            ds.receive(dp);
            System.out.println(new String(dp.getData(),0,dp.getLength()));
            System.out.println("对方IP地址："+dp.getAddress()+"  "+"端口："+dp.getPort());

            //发数据
            //准备数据
            String s=scanner.next();
            byte[] buf=s.getBytes();
            //打包
            DatagramPacket dp2=new DatagramPacket(buf, buf.length,dp.getAddress(),dp.getPort());
            ds.send(dp2);
            if("bye".equals(s)) {
                break;
            }

        }
        ds.close();
    }
}
