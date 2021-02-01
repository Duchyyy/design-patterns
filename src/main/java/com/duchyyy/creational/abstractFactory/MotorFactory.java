package com.duchyyy.creational.abstractFactory;

public class MotorFactory implements VehicleFactory{
    @Override
    public Vehicle createFourWheeled() {
        return new Car();
    }

    @Override
    public Vehicle createTwoWheeled() {
        return new Motorcycle();
    }
}
