package ua.ithillel.hw20.factory;

public class SofaFactory implements FurnitureFactory{
    @Override
    public Furniture getFurniture() {
        return new Sofa();
    }
}
