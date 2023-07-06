package ua.ithillel.hw20.factory;

public class Wardrobe implements Furniture{
    @Override
    public void make() {
        System.out.println("Зробили шафу");
    }
}
