package ua.ithillel.hw19;

import ua.ithillel.hw19.annotation.AfterSuite;
import ua.ithillel.hw19.annotation.BeforeSuite;
import ua.ithillel.hw19.annotation.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

public class TestRunner {
    public static void start(Class c) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Method[] methods = c.getMethods();
        boolean isAfterSuite = false;
        boolean isBeforeSuite = false;
        String methodAfterSuite = null;
        String methodBeforeSuite = null;
        List<String> testMethods = new ArrayList<>();


        for(int i = 0; i< methods.length; i++) {
            Annotation[] annotations = methods[i].getAnnotations();


            for(int j = 0; j< annotations.length; j++) {

                if (annotations[j].annotationType().equals(Test.class)){
                    testMethods.add(methods[i].getName());
                }

                if (annotations[j].annotationType().equals(BeforeSuite.class)){
                    if (!isBeforeSuite){
                        methodBeforeSuite=methods[i].getName();
                    } else {
                        throw new IllegalArgumentException("BeforeSuite можно только один раз");
                    }
                }

                if (annotations[j].annotationType().equals(AfterSuite.class)){
                    if (!isAfterSuite){
                        methodAfterSuite=methods[i].getName();
                    } else {
                        throw new IllegalArgumentException("AfterSuite можно только один раз");
                    }
                }

            }
            //System.out.println(list[i].getAnnotations());
        }

        Method methodBefore = c.getDeclaredMethod(methodBeforeSuite);
        methodBefore.invoke(c.getClass().newInstance());

    }
}
