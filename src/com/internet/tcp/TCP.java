package com.internet.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCP {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("127.0.0.1",2020);
        OutputStream op=s.getOutputStream();
        op.write("这是你卡了".getBytes());
        s.close();


    }
}
