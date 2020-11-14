package com.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionBreaksSingletonDemo {

    public static void main(String[] args) throws Exception {

        BasicEagerSingleton s1 = BasicEagerSingleton.getInstance();
        BasicEagerSingleton s2 = BasicEagerSingleton.getInstance();

        System.out.println("HashCode of s1 : " + System.identityHashCode(s1));
        System.out.println("HashCode of s2 : " + System.identityHashCode(s2));

        Class clazz = Class.forName("com.designpatterns.creational.singleton.BasicEagerSingleton");

        Constructor<BasicEagerSingleton> ctor = clazz.getDeclaredConstructor();

        // Below code will destroy the singleton pattern
        ctor.setAccessible(true);
        BasicEagerSingleton s3 = ctor.newInstance();

        System.out.println("HashCode of s3 : " + System.identityHashCode(s3));

        BasicEagerSingleton s4 = BasicEagerSingleton.getInstance();
        System.out.println("HashCode of s4 : " + System.identityHashCode(s4));
    }

}