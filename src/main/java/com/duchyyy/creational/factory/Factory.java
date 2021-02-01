package com.duchyyy.creational.factory;

public class Factory {
    public static Car carFactory(String model, String evidenceNumberPlate) {
        Car car = new Car(model,evidenceNumberPlate);

        return car;
    }
}
