package com.example.demo.nio.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2021/2/8 10:18
 */
public class ClientSocket {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket("localhost", 1348)) {
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("asDASD刚".getBytes());


            socket.shutdownOutput();
            byte[] a = new byte[1024];
            System.out.println("服务端接受" + new String(a, 0, inputStream.read(a)));
            socket.close();
        }
    }
}
