package pdp_lessons.module2.lesson6.task3;

public class Rectangle extends Figure {

    int sideA;
    int sideB;

    @Override
    public void area() {
        System.out.println(sideA * sideB);
    }

    @Override
    public void perimeter() {
        System.out.println(2 * (sideA + sideB));
    }
}
