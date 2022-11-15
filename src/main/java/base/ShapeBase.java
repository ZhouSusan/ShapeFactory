package base;

public class ShapeBase implements ShapeInterface{
    protected String name;
    protected int width, height;

    @Override
    public int calculateArea() {
        return 0;
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
}
