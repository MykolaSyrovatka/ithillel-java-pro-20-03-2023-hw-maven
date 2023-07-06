package ua.ithillel.hw20;

import ua.ithillel.hw20.builder.*;
import ua.ithillel.hw20.factory.CreateFurniture;
import ua.ithillel.hw20.factory.Furniture;
import ua.ithillel.hw20.factory.FurnitureType;
import ua.ithillel.hw20.strategy.Circle;
import ua.ithillel.hw20.strategy.Figure;
import ua.ithillel.hw20.strategy.Square;
import ua.ithillel.hw20.strategy.Triangle;

public class HomeWorkMain {
    public static void main(String[] args) {
        Square square = new Square(4.5);
        Circle circle = new Circle(4.5);
        Triangle triangle = new Triangle(4.5, 4.5);

        Figure figure = new Figure();
        figure.setArea(square);
        figure.calculateAreaFigure();
        figure.setArea(circle);
        figure.calculateAreaFigure();
        figure.setArea(triangle);
        figure.calculateAreaFigure();

        Furniture furniture = CreateFurniture.createFurnitureBySpeciality(FurnitureType.SOFA).getFurniture();
        furniture.make();


       Car car = new CarBuilderIMpl().setCarType(CarType.SEDAN)
               .setEngine(new Engine(EngineType.GASOLINE, 2488))
               .setWheel(new Wheel(18))
               .setTransmission(Transmission.AUTOMATIC)
               .build();
    }
}
