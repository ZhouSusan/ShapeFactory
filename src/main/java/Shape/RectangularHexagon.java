package Shape;
import base.ShapeBase;

public class RectangularHexagon extends ShapeBase {
    public RectangularHexagon(String name, double width, double height) {
        super(name, width, height);
    }

    @Override
    public double calculateArea() {
        return (6*(width*width))/(4*Math.tan(Math.PI/6));
    }
}
