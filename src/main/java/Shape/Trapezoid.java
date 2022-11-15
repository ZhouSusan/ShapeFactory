package Shape;
import base.ShapeBase;

public class Trapezoid extends ShapeBase{

    private double base;

    public Trapezoid(String name, double width, double base, double height) {
        super(name, width, height);
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (width + base) * height;
    }
}
