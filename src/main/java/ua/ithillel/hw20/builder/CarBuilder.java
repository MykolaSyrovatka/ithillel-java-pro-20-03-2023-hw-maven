package ua.ithillel.hw20.builder;

public interface CarBuilder {
    Car build();
    abstract CarBuilder setCarType(CarType carType);
    abstract CarBuilder setEngine(Engine engine);
    abstract CarBuilder setTransmission(Transmission transmission);
    abstract CarBuilder setWheel(Wheel wheel);
    abstract CarBuilder setColor(String color);

    }
