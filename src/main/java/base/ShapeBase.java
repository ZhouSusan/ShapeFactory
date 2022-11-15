package base;

public class ShapeBase implements ShapeInterface{
    protected String name;
    protected double width, height;

    public ShapeBase(String name, double width, double height) {
        super();
        this.name = name;
        this.width = width;
        this.height = height;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setWidth(double w) {
        this.width = w;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double h) {
        this.height = h;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
