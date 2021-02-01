package com.duchyyy.creational.factory;

public class Car {
    private String model;
    private String evidenceNumberPlate;

    public Car(String model, String evidenceNumberPlate) {
        this.model = model;
        this.evidenceNumberPlate = evidenceNumberPlate;
    }

    public void rev() {
        System.out.println("vrrrm");
    }


    public String getModel() {
        return model;
    }

    public String getEvidenceNumberPlate() {
        return evidenceNumberPlate;
    }
}
