package base;

public class ShapeBase implements ShapeInterface{
    protected String name;
    protected int width, height;

    public ShapeBase(String name, int width, int height) {
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

    public void setWidth(int w) {
        this.width = w;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int calculateArea() {
        return 0;
    }
}
