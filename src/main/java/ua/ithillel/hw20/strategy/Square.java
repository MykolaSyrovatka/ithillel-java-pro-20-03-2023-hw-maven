package ua.ithillel.hw20.strategy;

public class Square implements Area {

    private double sideSquare;

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideSquare, 2);
    }

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }
}
