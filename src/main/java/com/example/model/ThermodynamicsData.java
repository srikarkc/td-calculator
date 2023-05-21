package com.example.model;

public class ThermodynamicsData {

    private double temperature;
    private double pressure;
    private double volume;

    // Default constructor
    public ThermodynamicsData() {
    }

    // Parameterized constructor
    public ThermodynamicsData(double temperature, double pressure, double volume) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.volume = volume;
    }

    // Getters and setters
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
