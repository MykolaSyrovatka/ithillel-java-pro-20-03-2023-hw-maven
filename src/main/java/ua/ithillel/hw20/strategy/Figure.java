package ua.ithillel.hw20.strategy;

public class Figure {
    private Area area;
    public void calculateAreaFigure(){
        System.out.println(area.getClass().getSimpleName() +" " + area.calculateArea());
    }
    public void setArea(Area area) {
        this.area = area;
    }

}
