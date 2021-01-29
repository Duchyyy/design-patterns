package com.duchyyy.structural.bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("sony turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("sony turn off");

    }

    @Override
    public void setChanel(int number) {
        System.out.println("sony setChanel");

    }
}
