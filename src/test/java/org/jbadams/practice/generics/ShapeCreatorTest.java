package org.jbadams.practice.generics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShapeCreatorTest {

    @Test
    public void createCircles() {
        System.out.println("Creating circles through generics");
        ShapeCreator<Circle> shapeCreator = new ShapeCreator<>(Circle.class);
        String expected = "I'm a round circle";
        String actual = shapeCreator.getShapeGreeting();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void createSquares() {
        System.out.println("Creating squares through generics");
        ShapeCreator<Square> shapeCreator = new ShapeCreator<>(Square.class);
        String expected = "I'm a flat square";
        String actual = shapeCreator.getShapeGreeting();
        Assert.assertEquals(actual, expected);
    }
}