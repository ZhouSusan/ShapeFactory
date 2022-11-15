package Shape;
import base.ShapeBase;

public class Triangle extends ShapeBase{

    public Triangle(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        return width * height /2;
    }
}
