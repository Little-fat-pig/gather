package com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDP {

    //服务端
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(2020);
       while (true){
        byte[]bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length);
        ds.receive(dp);
        byte[] date=dp.getData();
        String message=new String(date,0,dp.getLength());
        System.out.println(message);
        System.out.println(dp.getAddress()+":"+dp.getPort()+":"+message);
       }




    }
}
