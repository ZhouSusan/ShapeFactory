package Shape;
import base.ShapeBase;

public class Oval extends ShapeBase{

    public Oval(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        return (width/2) * (height/2) * Math.PI;
    }
}
