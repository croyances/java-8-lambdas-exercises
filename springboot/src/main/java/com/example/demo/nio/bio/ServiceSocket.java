package com.example.demo.nio.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2021/2/8 10:20
 */
public class ServiceSocket {
    public static void main(String[] args) throws IOException {

        try (ServerSocket serverSocket = new ServerSocket(1348)) {
//            while ((serverSocket.accept()) != null) {
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            OutputStream outputStream = accept.getOutputStream();
            byte[] b = new byte[1024];
            System.out.println("客戶端發送" + new String(b, 0, inputStream.read(b)));

            outputStream.write("aSDASDADQWE士大夫十大".getBytes());
//          }
        }


    }
}
