package ua.ithillel.hw19;

import java.lang.reflect.InvocationTargetException;

public class HomeWorkMain {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        TestRunner.start(OneTest.class);
    }
}
