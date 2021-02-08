package com.example.demo.nio.channel;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SocketChannel;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2021/2/4 9:20
 */
public class ServerSocketChannelDemo {
    private static final String DEMOGRAPHIC = "D:\\croyances\\java-8-lambdas-exercises\\blahblah.txt";

    public static void main(String[] args) throws Exception {


        java.nio.channels.ServerSocketChannel open = java.nio.channels.ServerSocketChannel.open();
        ServerSocket socket = open.socket();
        open.configureBlocking(false);
        socket.bind(new InetSocketAddress(1234));
        while (true) {
            SocketChannel accept = open.accept();
            if (accept == null) {
                System.out.println(1);
            } else {

                System.out.println(12);
            }
        }


    }


}
