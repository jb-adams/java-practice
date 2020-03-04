package org.jbadams.practice.annotated;

import java.lang.annotation.Annotation;

import org.jbadams.practice.annotations.Counter;
import org.jbadams.practice.annotations.Greeter;
import org.jbadams.practice.annotations.Singer;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.reflect.InvocationTargetException;

public class GreetingsTest {

    @Test
    public void verifyAnnotationsFromGreetingsClass() {
        System.out.println("Testing @Greeter annotation");

        /* access annotation using reflection */ 
        Greeter greetings = Greetings.class.getAnnotation(Greeter.class);
        System.out.println(greetings.greet());

        /* JDK 8 method, access all annotations from a class */
        Annotation[] annotations = Greetings.class.getDeclaredAnnotations();
        System.out.println(annotations.length); // should be 2 (Greeter, Counter)
        System.out.println("1st annotation: " + annotations[0]); // the Greeter Annotation
        System.out.println("2nd annotation: " + annotations[1]); // the Counter Annotation
        Class<?> annotationClass = annotations.getClass(); // all annotations
        // combined
        System.out.println(annotationClass); // Annotation

        /* get multiple annotations by class */ 
        Greeter greeter = Greetings.class.getDeclaredAnnotation(Greeter.class);
        Counter counter = Greetings.class.getDeclaredAnnotation(Counter.class);
        Singer singer = Greetings.class.getDeclaredAnnotation(Singer.class);
        System.out.println("***");
        System.out.println("Does Greetings have a Greeter? " + greeter);
        System.out.println("Does Greetings have a Counter? " + counter);
        System.out.println("Does Greetings have a Singer? " + singer);
        System.out.println("Greeter annotation says: " + greeter.greet());
        System.out.println("Counter annotation says: " + counter.count());
    }
}