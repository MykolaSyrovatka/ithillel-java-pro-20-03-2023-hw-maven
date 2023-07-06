package ua.ithillel.hw20.builder;

public class CarBuilderIMpl implements CarBuilder {
    Car car = new Car();


    @Override
    public Car build() {
        return car;
    }

    @Override
    public CarBuilder setCarType(CarType carType) {
        car.setCarType(carType);
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        car.setTransmission(transmission);
        return this;
    }

    @Override
    public CarBuilder setWheel(Wheel wheel) {
        car.setWheel(wheel);
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }
}
