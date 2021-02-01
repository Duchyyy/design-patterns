package com.duchyyy.creational.abstractFactory;

public class MotorlessFactory implements VehicleFactory{
    @Override
    public Vehicle createFourWheeled() {
        return new SideCar();
    }

    @Override
    public Vehicle createTwoWheeled() {
        return new Bicycle();
    }
}
