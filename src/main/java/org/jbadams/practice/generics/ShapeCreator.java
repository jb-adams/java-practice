package org.jbadams.practice.generics;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.InvocationTargetException;

public class ShapeCreator<T extends Shape> {

    private final Class<T> typeClass;
    private Shape shape;

    public ShapeCreator(Class<T> typeClass) {
        this.typeClass = typeClass;

        try {
            this.shape = typeClass.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException |
                 InvocationTargetException | NoSuchMethodException ex) {
        }
    }

    public Class<T> getTypeClass() {
        return typeClass;
    }

    public String getShapeGreeting() {
        return shape.greeting();
    }

    public void createShapeList() {
        List<T> shapeList = new ArrayList<>();
    }
}