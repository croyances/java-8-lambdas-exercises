package com.example.demo.nio.select;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2021/2/7 14:05
 */
public class ServiceChannelDemo {

    public static void main(String[] args) throws IOException {

        SocketChannel open = SocketChannel.open();
        open.bind(new InetSocketAddress(1235)).connect(new InetSocketAddress(1234));
    }
}
