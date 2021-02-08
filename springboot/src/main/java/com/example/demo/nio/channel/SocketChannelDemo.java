package com.example.demo.nio.channel;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2021/2/5 14:40
 */
public class SocketChannelDemo {


    public static void main(String[] args) throws IOException {

        InetSocketAddress addr = new InetSocketAddress("127.0.0.1", 1369);
        SocketChannel sc = SocketChannel.open();
        sc.configureBlocking(false);
        sc.connect(addr);
        while (!sc.finishConnect()) {
            System.out.println(sc.isConnected());
            System.out.println(sc.isConnectionPending());
            System.out.println(sc.finishConnect());
            System.out.println(21);
        }

        sc.close();

    }
}
