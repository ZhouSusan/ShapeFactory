package Shape;
import base.ShapeBase;

public class Circle extends ShapeBase{
    public Circle(String name, int width, double height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        return (width * height) * Math.PI;
    }
}
