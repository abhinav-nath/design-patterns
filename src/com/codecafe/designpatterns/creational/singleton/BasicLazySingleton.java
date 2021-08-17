package com.codecafe.designpatterns.creational.singleton;

public class BasicLazySingleton {

    private static BasicLazySingleton instance = null;

    int value = 0;

    private BasicLazySingleton() {}

    public static BasicLazySingleton getInstance() {

        // new instance will only be created when asked for
        if (instance == null)
            instance = new BasicLazySingleton();

        return instance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}