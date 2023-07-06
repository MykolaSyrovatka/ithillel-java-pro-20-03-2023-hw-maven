package ua.ithillel.hw20.builder;

public class Wheel {
    private Integer radius;

    public Wheel() {
        this.radius = 16;
    }

    public Wheel(Integer radius) {
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }
}
