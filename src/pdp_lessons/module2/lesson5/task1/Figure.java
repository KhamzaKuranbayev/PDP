package pdp_lessons.module2.lesson5.task1;

public class Figure {

    public int getArea(int a, int b) {
        return a * b;
    }

    public double getArea(double a, double b) {
        return a * b;
    }

    public double getArea(int radius) {
        return Math.PI * radius * radius;
    }

    public double getArea(double radius) {
        return Math.PI * radius * radius;
    }

    public int getPerimeter(int a, int b) {
        return 2 * (a + b);
    }

    public double getPerimeter(double a, double b) {
        return 2 * (a + b);
    }

    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    public void print(int a, int b) {
        System.out.println(a + ", " + b);
    }

    public void print(double a, double b) {
        System.out.println(a + ", " + b);
    }

    public void print(int radius) {
        System.out.println(radius);
    }

    public void print(double radius) {
        System.out.println(radius);
    }


}
