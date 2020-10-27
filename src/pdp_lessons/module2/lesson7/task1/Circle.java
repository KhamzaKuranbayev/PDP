package pdp_lessons.module2.lesson7.task1;

public class Circle extends Shape{

    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 0;
    }

    public double getRadius() {
        return radius;
    }

}
