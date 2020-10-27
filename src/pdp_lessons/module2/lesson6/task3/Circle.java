package pdp_lessons.module2.lesson6.task3;

public class Circle extends Figure {

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println(2 * Math.PI * radius);
    }

    @Override
    public void perimeter() {
        System.out.println(2 * Math.PI * radius);
    }
}
