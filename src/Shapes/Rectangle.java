package Shapes;

public class Rectangle {
    protected double width;
    protected double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    public double getArea() {
        return width * height;
    }
}
