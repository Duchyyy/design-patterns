package com.duchyyy.structural.bridge;

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("samsung turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("samsung turn off");

    }

    @Override
    public void setChanel(int number) {
        System.out.println("samsung set channel");

    }
}
