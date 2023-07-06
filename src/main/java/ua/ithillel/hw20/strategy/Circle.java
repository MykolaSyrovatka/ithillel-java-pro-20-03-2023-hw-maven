package ua.ithillel.hw20.strategy;

public class Circle implements Area {
    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(double circleRadius) {
        this.circleRadius = circleRadius;
    }
}
