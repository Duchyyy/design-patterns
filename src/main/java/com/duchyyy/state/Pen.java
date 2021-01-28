package com.duchyyy.state;

public class Pen implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("pen icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("write line");
    }
}
