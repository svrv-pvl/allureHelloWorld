package org.example;

public class Car {
    private String model;
    private EngineMode engineMode;

    public Car(){
        engineMode = EngineMode.STOPPED;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void startEngine(){
        engineMode = EngineMode.STARTED;
    }

    public EngineMode getEngineMode() {
        return engineMode;
    }

    public void stopEngine(){

    }
}
