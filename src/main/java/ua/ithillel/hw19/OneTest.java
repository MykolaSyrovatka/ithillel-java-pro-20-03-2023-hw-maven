package ua.ithillel.hw19;

import ua.ithillel.hw19.annotation.AfterSuite;
import ua.ithillel.hw19.annotation.BeforeSuite;
import ua.ithillel.hw19.annotation.Test;

public class OneTest {
    @BeforeSuite
    public void beforeSuiteMethod(){
        System.out.println("Before suite test one");
    }

    @Test
    public void testMethodOne(){
        System.out.println("Test method one");
    }

    @Test
    public void testMethodTwo(){
        int priority = 3;
        System.out.println("Test method two");
    }

    @Test
    public void testMethodThree(){
        int priority = 2;
        System.out.println("Test method three");
    }

    @AfterSuite
    public void afterSuiteMethod(){
        System.out.println("After suite test one");
    }
}
