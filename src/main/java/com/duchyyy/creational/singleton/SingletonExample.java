package com.duchyyy.creational.singleton;

public class SingletonExample {
    private static SingletonExample instance = null;

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        if (instance == null) {
            instance = new SingletonExample();
        }
        return instance;
    }
    public static void printData() {
        System.out.println("Instance created, compare with equals.");
    }
}
