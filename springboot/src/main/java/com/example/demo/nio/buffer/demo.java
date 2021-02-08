package com.example.demo.nio.buffer;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;

import static java.nio.ByteOrder.BIG_ENDIAN;
import static java.nio.ByteOrder.nativeOrder;

/**
 * @author caiwenhai
 * @version 1.0
 * @date 2021/2/2 9:42
 */
public class demo {

    public static void main(String[] args) {
        ByteOrder byteOrder = nativeOrder();
        ByteBuffer byteBuffer =
                ByteBuffer.allocate(7).order(ByteOrder.BIG_ENDIAN);
        CharBuffer charBufferA = byteBuffer.asCharBuffer();

        byteBuffer.put(0, (byte) 0);
        byteBuffer.put(1, (byte) 'H');
        byteBuffer.put(2, (byte) 0);
        byteBuffer.put(3, (byte) 'i');
        byteBuffer.put(4, (byte) 0);
        byteBuffer.put(5, (byte) '!');
        byteBuffer.put(6, (byte) 0);
        System.out.println(byteBuffer);
        System.out.println(charBufferA);

        ByteBuffer buffer = ByteBuffer.allocate(10);

        CharBuffer charBuffer1 = buffer.asCharBuffer();
        charBuffer1.put('A');
        buffer.put((byte) 1);
        CharBuffer asFDASFF = CharBuffer.wrap("asFDASFF", 0, 5);

        ByteOrder order = asFDASFF.order();

        buffer.order(ByteOrder.LITTLE_ENDIAN);
        String s = buffer.order().toString();
        order = BIG_ENDIAN;
        CharBuffer wrap = CharBuffer.wrap(new char[20], 19, 1);
        CharBuffer V = CharBuffer.allocate(26);


        boolean b = wrap.hasArray();
        boolean b2 = V.hasArray();
        wrap.put('A');
        boolean b1 = wrap.hasArray();
        Buffer flip = wrap.flip();

        char[] chars = new char[10];


        V.put('A')
                .put('B')
                .put('B')
        ;


//        CharBuffer VV = CharBuffer.allocate(26);
//        VV
//                .put('D')
//                .put('0')
//        .put('0');
//
//        int i = V.compareTo(VV);

        V.put('D')
                .put('E')
                .put('F')
                .put('G')
                .put('H')
                .put('I')
                .put('J')
                .put('K')
                .put('L')
                .put('M')
                .put('N')
                .put('O')
                .put('P')
                .put('Q');

        char[] chars1 = new char[80];
        CharBuffer charBuffer = V.get(chars1);
        char[] array = charBuffer.array();

        Buffer markA = V.mark();

        V.put('R')
                .put('S')
                .put('T')
                .put('U');
        Buffer aamark = V.reset();


        V.put('V')
                .put('W')
                .put('X');
        Buffer markB = V.mark();
        V.put('Y')
                .put('Z')
        ;

        V.flip();
        char c = V.get();
        V.get();
        V.get();
        V.get();
        V.limit(20);
        V.compact();
        Buffer Amark = V.mark();

        V.chars().forEach(System.out::println);
//        System.out.println(buffer.position());
//        byte b = buffer.get();
//        System.out.println(buffer.position());
//        int limit = buffer.limit();
//        buffer.rewind();
//        int limita = buffer.limit();
//        System.out.println(buffer.position());
//        char bb = (char)buffer.get();
//        System.out.println(buffer.position());
//        buffer.hasRemaining();

//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        V.flip();
//        AtomicInteger a = new AtomicInteger(0);
//        for (int i = 0; i < 10; i++) {
//            executorService.execute(()->{
//                { for (int ii = 0; V.hasRemaining( ); ii++) {
//                    System.out.println(String.format("%2d",a.incrementAndGet())+"--"+V.get());
//                }}
//
//            });
//        }
    }
}
