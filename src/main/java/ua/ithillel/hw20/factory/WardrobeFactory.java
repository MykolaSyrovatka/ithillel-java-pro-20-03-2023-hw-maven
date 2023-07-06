package ua.ithillel.hw20.factory;

public class WardrobeFactory implements FurnitureFactory{
    @Override
    public Furniture getFurniture() {
        return new Wardrobe();
    }
}
