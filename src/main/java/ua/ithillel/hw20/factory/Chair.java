package ua.ithillel.hw20.factory;

public class Chair implements Furniture{
    @Override
    public void make() {
        System.out.println("Зробили стілець");
    }
}
