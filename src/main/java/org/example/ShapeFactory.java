package org.example;
import base.ShapeBase;

public class ShapeFactory {

    public void DisplayArea(ShapeBase base) {
        System.out.format("Display the area for the shape's name: %s , width = %s and height = %s." ,
                base.getName(), base.getWidth(), base.getHeight());
        System.out.format("Total area for %s is %s.", base.getName(), base.calculateArea());
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}