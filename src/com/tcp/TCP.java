package com.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP {
    //服务端
    public static void main(String[] args) throws IOException {
        ServerSocket sc=new ServerSocket(2020);
        Socket s=sc.accept();
        InputStream in=s.getInputStream();
        byte [] bytes=new byte[1024];
        int read = in.read(bytes);
        String msg=new String(bytes,0,read);
        System.out.println(s.getInetAddress().getHostName()+":"+s.getPort()+msg);
        s.close();
        sc.close();
    }

}
