package com.example.demo.thread.dielock;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: croyances
 * @Date: 2020/7/23 21:51
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println("第一次拿到单例模式创建的对象: " + Singleton.getSingle());

        Class<Singleton> clazz = Singleton.class;
        Constructor<Singleton> c0 = clazz.getDeclaredConstructor();
        c0.setAccessible(true);
        Singleton po = c0.newInstance();
        System.out.println("反射创建出来的对象: " + po);

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Singleton singleton1 = (Singleton) field.get(Singleton.getSingle());
            System.out.println("拿到单例模式创建的对象: " + singleton1);
            field.set(Singleton.getSingle(), po); //把反射创建出来的对象赋值给单例对象
            System.out.println("第二次拿到单例模式创建的对象: " + Singleton.getSingle());
        }
    }
}
