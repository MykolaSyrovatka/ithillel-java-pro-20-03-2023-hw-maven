package ua.ithillel.hw20.factory;

public class Table implements Furniture{
    @Override
    public void make() {
        System.out.println("Зробили стіл");
    }
}
