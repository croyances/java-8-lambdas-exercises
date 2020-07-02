package com.insightfullogic.java8.digui;

import com.sun.xml.internal.ws.resources.UtilMessages;
import org.omg.CORBA.INTERNAL;

public class qingwa {

    public static void main(String[] args) {
        int i = howTime(5);
        System.out.println(i);

    }

    private static int howTime(int a) {
        if (a <= 2) {
            return a;
        } else
            return howTime(a - 1) + howTime(a - 2);
    }
}
