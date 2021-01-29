package com.duchyyy.structural.adapter;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Aplying vivit filter.");
    }
}
