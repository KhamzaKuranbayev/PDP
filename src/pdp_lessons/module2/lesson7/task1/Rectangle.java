package pdp_lessons.module2.lesson7.task1;

public class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return 0;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}
