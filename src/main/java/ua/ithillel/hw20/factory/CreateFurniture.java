package ua.ithillel.hw20.factory;

public class CreateFurniture {
    private static FurnitureFactory furnitureFactory;

    public static FurnitureFactory createFurnitureBySpeciality(FurnitureType furnitureType){
        switch (furnitureType){
            case SOFA -> furnitureFactory = new SofaFactory();
            case CHAIR -> furnitureFactory = new ChairFactory();
            case TABLE -> furnitureFactory = new TableFactory();
            case WARDROBE -> furnitureFactory = new WardrobeFactory();

        }
        return furnitureFactory;
    }
}
