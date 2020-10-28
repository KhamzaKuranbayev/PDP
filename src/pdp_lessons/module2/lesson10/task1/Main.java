package pdp_lessons.module2.lesson10.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Circle> circles1 = new ArrayList<>(3);
        circles1.add(new Circle(10));
        circles1.add(new Circle(20));
        circles1.add(new Circle(30));

        List<Circle> circles2 = new ArrayList<>(circles1);
        System.out.println(circles2.get(1).getRadius());
    }
}
