package ua.ithillel.hw20.factory;

public class ChairFactory implements FurnitureFactory{
    @Override
    public Furniture getFurniture() {
        return new Sofa();
    }
}
