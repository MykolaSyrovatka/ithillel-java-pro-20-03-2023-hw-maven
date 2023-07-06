package ua.ithillel.hw20.factory;

public class Sofa implements Furniture {

    @Override
    public void make() {
        System.out.println("Зробили диван");
    }
}
