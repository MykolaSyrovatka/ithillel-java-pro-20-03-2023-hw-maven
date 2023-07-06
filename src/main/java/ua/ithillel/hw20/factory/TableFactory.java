package ua.ithillel.hw20.factory;

public class TableFactory implements FurnitureFactory{
    public Furniture getFurniture() {
        return new Table();
    }
}
