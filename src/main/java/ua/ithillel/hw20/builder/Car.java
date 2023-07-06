package ua.ithillel.hw20.builder;

public class Car {
    private CarType carType;
    private Engine engine;
    private Transmission transmission;
    private Wheel wheel;
    private String color;


    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", wheel=" + wheel +
                ", color='" + color + '\'' +
                '}';
    }
}
