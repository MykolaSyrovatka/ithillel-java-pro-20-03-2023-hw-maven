package ua.ithillel.hw20.strategy;

public class Triangle implements Area {

    private double triangleHeight;
    private double sideTriangle;

    public Triangle(double triangleHeight, double sideTriangle) {
        this.triangleHeight = triangleHeight;
        this.sideTriangle = sideTriangle;
    }

    @Override
    public double calculateArea() {
        return sideTriangle*triangleHeight/2;
    }

    public double getTriangleHeight() {
        return triangleHeight;
    }

    public void setTriangleHeight(double triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    public double getSideTriangle() {
        return sideTriangle;
    }

    public void setSideTriangle(double sideTriangle) {
        this.sideTriangle = sideTriangle;
    }
}
