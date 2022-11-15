package org.example;
import Shape.Triangle;
import base.ShapeBase;
import Shape.Rectangle;
import Shape.Oval;
import Shape.Circle;


public class ShapeFactory {

    public static void DisplayArea(ShapeBase base) {
        System.out.format("Display the area for the shape's name: %s , width = %s and height = %s.\n" ,
                base.getName(), base.getWidth(), base.getHeight());
        System.out.format("Total area for %s is %s.\n", base.getName(), base.calculateArea());
    }
    public static void main(String[] args) {
        ShapeBase[] shapes = new ShapeBase[4];
        shapes[0] = new Triangle("Triangle", 30, 15);
        shapes[1] = new Rectangle("Rectangle", 10, 20);
        shapes[2] = new Oval("Oval", 5, 10);
        shapes[3] = new Circle("Circle", 55, 55);

        for (ShapeBase s: shapes) {
            DisplayArea(s);
        }
    }
}